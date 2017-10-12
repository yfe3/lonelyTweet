/*
 * Copyright (c) 2017 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta. You can find a copy of this license in this project. Otherwise please contact yfeng3@ualberta.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.OutputStream;

import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/**
 * subclass LonelyTwitterActivity,
 * serves as main function,
 * create the tweet
 */
public class LonelyTwitterActivity extends Activity {

	private static final String FILENAME = "file.sav";
	private EditText bodyText;
	private ListView oldTweetsList;


	

	private ArrayList<NormalTweet> tweets = new ArrayList<NormalTweet>();
	private ArrayAdapter<NormalTweet> adapter;



	@Override
	/**
	 * Called when the activity is first created.
	 */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		Button saveButton = (Button) findViewById(R.id.save);
		Button clearButton = (Button) findViewById(R.id.search);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);

		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);
				String text = bodyText.getText().toString();

				tweets.add(new NormalTweet(text));
				adapter.notifyDataSetChanged();

				saveInFile();



			}
		});


		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);

		clearButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				NormalTweet newTweet = new NormalTweet("text");
				tweets.add(newTweet);
				adapter.notifyDataSetChanged();
				//saveInFile(); // TODO replace this with elastic search
				ElasticsearchTweetController.AddTweetsTask addTweetsTask
						= new ElasticsearchTweetController.AddTweetsTask();
				addTweetsTask.execute(newTweet);
			}

		});
}


	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();

		loadFromFile();

		adapter = new ArrayAdapter<Tweet>(this, R.layout.list_item, tweets);
		oldTweetsList.setAdapter(adapter);
	}

	private void loadFromFile() {
		//ArrayList<String> tweets = new ArrayList<String>();
		try {
			FileInputStream fis = openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));

			Gson gson = new Gson();
			Type listType = new TypeToken<ArrayList<NormalTweet>>() {
			}.getType();

			tweets = gson.fromJson(in, listType);
		}catch (FileNotFoundException e){

		//loadFromFile(); // TODO replace this with elastic search
		ElasticsearchTweetController.GetTweetsTask getTweetsTask =
				new ElasticsearchTweetController.GetTweetsTask();
		getTweetsTask.execute("");}

		catch (Exception e){
			Log.i("Error","failed to get tweets from the object");
		}

		adapter = new ArrayAdapter<NormalTweet>(this,
				R.layout.list_item, tweetList);
		oldTweetsList.setAdapter(adapter);
	}




    /**
     * save tweets on disk.
     */
	private void saveInFile() {
		try {
			FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);

			OutputStreamWriter writer = new OutputStreamWriter(fos);
			Gson gson = new Gson();
			gson.toJson(tweets,writer);
			writer.flush();

			fos.close();
		}catch (FileNotFoundException e){}


		catch (Exception e){
			Log.i("Error","failed to get tweets from the object");
		}


	}


}
