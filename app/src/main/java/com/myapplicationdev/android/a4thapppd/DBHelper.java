package com.myapplicationdev.android.a4thapppd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.myapplicationdev.android.a4thapppd.QuizContract.*;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Quiz.db";
    private static final int DATABASE_VERSION = 9;

    private SQLiteDatabase db;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionTable.TABLE_NAME + " ( " +
                QuestionTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionTable.COLUMN_QUESTION + " TEXT, " +
                QuestionTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionTable.COLUMN_ANSWER_NR + " INTEGER, " +
                QuestionTable.COLUMN_DIFFICULTY + " TEXT " +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable(){
        Question q1 = new Question("A cyclist is using the pedestrian crossing when red man is on, what should you do?", "A. Horn to warn him of your right of way and call police","B. lash your headlights at him","C. Slow down and let him cross",3, Question.DIFFICULTY_EASY);
        addQuestion(q1);
        Question q2 = new Question("How should you check the blind spots?", "A. Turn your head and look over your shoulders.","B. Check through the side view mirrors","C. Check through the rear view mirrors",1, Question.DIFFICULTY_EASY);
        addQuestion(q2);
        Question q3 = new Question("You are passing a bus at a bus stop that is letting down passengers. What should you do?", "A. You should continue with constant speed so you won't confuse the bus driver","B. You should slow down because there might be passengers crossing the road.","C. You should stop, wait until the bus gets out of the bus stop and back to the road again.",2, Question.DIFFICULTY_EASY);
        addQuestion(q3);
        Question q4 = new Question("What does COE stand for?", "A. Certificate of Empowerment.","B. Car Ownership Entitlement.","C. Certificate of Entitlement.",3, Question.DIFFICULTY_EASY);
        addQuestion(q4);
        Question q5 = new Question("Where can you find Traffic Information Displays (TID) which show traffic conditions ahead?", "A. Along the expressways","B. Along the major roads","C. Every 500m on the road to inform road users of potential hazards",1, Question.DIFFICULTY_EASY);
        addQuestion(q5);
        Question q6 = new Question("You may park your vehicle any time on Sundays and public holidays on a road, which has ______", "A. A continuous yellow line along the side.","B. Parallel continuous yellow lines along the side.","C. A single yellow zig-zag line along the side",1, Question.DIFFICULTY_EASY);
        addQuestion(q6);
        Question q7 = new Question("When you hear the police car's siren from behind, you should", "A. Speed up not to cause any obstruction","B. Slow down, keep left or move aside","C. Maintain the speed and keep left",2, Question.DIFFICULTY_EASY);
        addQuestion(q7);
        Question q8 = new Question("To keep your focus on the road ahead while driving, you should avoid:", "A. Checking your rear view and side mirrors.","B. Talking to passengers in the vehicle","C. Looking at a map or directory.",3, Question.DIFFICULTY_EASY);
        addQuestion(q8);
        Question q9 = new Question("When being overtaken, you should ______", "A. Slow down if necessary to allow the overtaking vehicle to pass","B. Move to the right and allow more space for the overtaking vehicle.","C. Speed up and avoid being overtaken.",1, Question.DIFFICULTY_EASY);
        addQuestion(q9);
        Question q10 = new Question("While waiting for the lights to change at a traffic light controlled junction, you should not", "A. Check you rear view mirror and wing mirrors.","B. Make a quick phone call.","C. Engage your handbrake.",2, Question.DIFFICULTY_EASY);
        addQuestion(q10);
        Question q11 = new Question("You may cross the centre line but not allowed to park your vehicle on either side of a road, which has ______", "A. A broken white line along the centre.","B. A single continuous white line along the centre.","C. Two parallel continuous white lines along the centre.",2,Question.DIFFICULTY_EASY);
        addQuestion(q11);
        Question q12 = new Question("What are the consequences of tailgating?", "A. Driver in front will drive faster","B. Driver in front of you may become nervous,stop suddenly and accident might occur","C. No consequences",2, Question.DIFFICULTY_EASY);
        addQuestion(q12);
        Question q13 = new Question("When can you overtake on the left?", "A. Never.","B. When the driver in front has signaled his intention to turn left.","C. When you want to turn left at a junction.",3, Question.DIFFICULTY_EASY);
        addQuestion(q13);
        Question q14 = new Question(" A single white line and a word STOP painted on the road indicates that", "A. Traffic is required to stop close to and before this line","B. Traffic must wait for pedestrians to cross the road","C. Traffic approaching this line must give way to traffic on a major road",1, Question.DIFFICULTY_EASY);
        addQuestion(q14);
        Question q15 = new Question("Traffic signs and signals", "A. Should always be obeyed regardless of the traffic flow.","B. Should only be obeyed when the traffic flow is heavy.","C. May be disregarded if the road is fairly deserted.",1, Question.DIFFICULTY_EASY);
        addQuestion(q15);
        Question q16 = new Question("How should you use the choke to start a cold engine?", "A. Pull the choke knob sufficiently out and start the engine.","B. Push the choke knob sufficiently in and start the engine.","C. Push the choke knob sufficiently to the left and start the engine.",1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q16);
        Question q17 = new Question("When approaching a bend, you should", "A. Look at the side mirror","B. Look behind","C. Look far ahead",3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q17);
        Question q18 = new Question("To avoid skidding on a wet road when applying emergency brake, you should", "A. Brake hard till the car stop","B. Depress and release the brake pedal repeatedly","C. Use handbrake and footbrake at the same time",2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q18);
        Question q19 = new Question("You may cross the centre line of a two-way street when ______ ", "A. You want to speed","B. There is no oncoming traffic","C. Passing road hazards",3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q19);
        Question q20 = new Question("When the vehicle you are overtaking accelerates, what should you do?", "A. Slow down and filter back to the traffic flow","B. Sound you horn to warn him of your intentions","C. Increase your speed in order to pass it safely",1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q20);
        Question q21 = new Question("When driving round a bend or corner, you should ______ to reduce the effect of the centrifugal force.", "A. Slow down","B. Maintain your speed","C. Speed up",1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q21);
        Question q22 = new Question("Which of the following statement is TRUE, regarding driving after drinking alcohol?", "A. As long as you do not feel drunk and think you can drive safely, you may drive.","B. As long as you do not consume more than one glass of alcohol, it is safe for you to drive.","C. You should not drive after consuming even a small amount of alcohol.",3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q22);
        Question q23 = new Question("When you are approaching a steep hill, you should:", "A. Shift to either 3rd or 4th gear before going uphill","B. shift to either 1st or 2nd gear before going uphill","C. Shift to either 1st or 2nd gear when the car is slowed down on the slope",2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q23);
        Question q24 = new Question("What is the daily checks that you need to do?", "A. Check the chassis","B. Check the air cleaner","C. Check the registration plates, lights and mirrors.",3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q24);
        Question q25 = new Question("A lorry travelling on your right signals its intention to turn left, what should you do?", "A. Speed up and try to pass the lorry before it turns","B. Slow down and stop if necessary to allow the lorry to turn left","C. Just maintain at your current speed",2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q25);
        Question q26 = new Question("Roughly, how many percent of information perceived from the driver's eyes?", "A. 70%","B. 80%","C. 900%",2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q26);
        Question q27 = new Question("In order to stop gradually the driver should", "A. Pull the handbrake up slowly","B. Apply the foot-brake by slamming on it","C. Step on the foot-brake intermittently",3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q27);
        Question q28 = new Question("When moving off facing uphill, you should engage the ______ .", "A. 1st Gear","B. 3rd Gear","C. 5th Gear",1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q28);
        Question q29 = new Question("While performing the emergency brake, you should", "A. Depress the brake pedal first, followed by the clutch","B. Depress the clutch pedal first, followed by the brake pedal","C. Depress both brake and clutch pedal at the same time",1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q29);
        Question q30 = new Question("When adjusting the side mirror:", "A. The mirror should be 45 degree with the body of the car.","B. Part of the car should be seen in the mirror.","C. No part of the car can be seen in the mirror.",2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q30);
        Question q31 = new Question("What is the free play of the front brake lever and rear brake pedal?", "A. 5 - 10mm","B. 10 - 20mm","C. 15 - 20mm",3, Question.DIFFICULTY_HARD);
        addQuestion(q31);
        Question q32 = new Question("Riding a motorcycle, your knees should:", "A. Bend inwards","B. Bend outwards","C. Slightly touch the fuel tank.",3, Question.DIFFICULTY_HARD);
        addQuestion(q32);
        Question q33 = new Question("When riding with pillion, the pillion rider should hold:", "A. Around the rider's waist.","B. On the rider's lap.","C. Do not hold the rider.",1, Question.DIFFICULTY_HARD);
        addQuestion(q33);
        Question q34 = new Question("For every distance of one car length, you should be travelling at ___", "A. 10 Km/h.","A. 20 Km/h.","A. 30 Km/h.",1, Question.DIFFICULTY_HARD);
        addQuestion(q34);
        Question q35 = new Question("If u experience piston jam, what do you do?", "A. Pull clutch and depress brake slowly while moving to the side of the road.","B. Don't do anything.","C. Jam your brakes.",1, Question.DIFFICULTY_HARD);
        addQuestion(q35);
        Question q36 = new Question("When pushing the motorcycle forward you should", "A. Keep the motorcycle away from you & handlebar slightly to the left","B. Keep the motorcycle upright & in contact with your body","C. Keep the motorcycle towards you & handlebar slightly to the right",2, Question.DIFFICULTY_HARD);
        addQuestion(q36);
        Question q37 = new Question("Within the 50 meters of the white zig-zag lines, you are allowed to:", "A. Stop and wait for pillion","B. Alight passengers.","C. Overtake",2, Question.DIFFICULTY_HARD);
        addQuestion(q37);
        Question q38 = new Question("What should you do when approaching a slope?", "A. Increase speed on approaching the slope","B. Slow down on approaching the slope","C. Stop on approaching the slope",1, Question.DIFFICULTY_HARD);
        addQuestion(q38);
        Question q39 = new Question("What is the clutch level used for?", "A. connect and disconnect engine power","B. acceleration and deceleration.","C. stopping the vehicle.",1, Question.DIFFICULTY_HARD);
        addQuestion(q39);
        Question q40 = new Question("When going upslope, which gear should be engaged?", "A. Neutral","B. Gear 1","C. Gear 3",2, Question.DIFFICULTY_HARD);
        addQuestion(q40);
        Question q41 = new Question("What is the free play of the clutch lever?", "A. 20 - 30 mm","B. 10 - 20 mm","C. 5 - 10 mm",2, Question.DIFFICULTY_HARD);
        addQuestion(q41);
        Question q42 = new Question("While riding, you hear siren of an ambulance:", "A. You must stop immediately to give way.","B. You must move to the left or right.","C. Horn the front vehicle and move faster to avoid obstructing the emergency vehicle",2, Question.DIFFICULTY_HARD);
        addQuestion(q42);
    }

    private void addQuestion(Question question){
        ContentValues cv = new ContentValues();
        cv.put(QuestionTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        cv.put(QuestionTable.COLUMN_DIFFICULTY, question.getDifficulty());
        db.insert(QuestionTable.TABLE_NAME,null, cv);
    }

    public ArrayList<Question> getAllQuestions(){
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + QuestionTable.TABLE_NAME, null);

        if (cursor.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(cursor.getString(cursor.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                question.setOption1(cursor.getString(cursor.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                question.setOption2(cursor.getString(cursor.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                question.setOption3(cursor.getString(cursor.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                question.setAnswerNr(cursor.getInt(cursor.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));
                question.setDifficulty(cursor.getString(cursor.getColumnIndex(QuestionTable.COLUMN_DIFFICULTY)));
                questionList.add(question);
            }while (cursor.moveToNext());
        }

        cursor.close();
        return questionList;

    }

    public ArrayList<Question> getQuestions(String difficulty){
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();

        String[] selectionArgs = new String[]{difficulty};
        Cursor cursor = db.rawQuery("SELECT * FROM " + QuestionTable.TABLE_NAME +
                " WHERE " + QuestionTable.COLUMN_DIFFICULTY + " = ? ", selectionArgs);

        if (cursor.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(cursor.getString(cursor.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                question.setOption1(cursor.getString(cursor.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                question.setOption2(cursor.getString(cursor.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                question.setOption3(cursor.getString(cursor.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                question.setAnswerNr(cursor.getInt(cursor.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));
                question.setDifficulty(cursor.getString(cursor.getColumnIndex(QuestionTable.COLUMN_DIFFICULTY)));
                questionList.add(question);
            }while (cursor.moveToNext());
        }

        cursor.close();
        return questionList;

    }
}
