package com.ozancansari.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        System.out.println("on create called");

        testMethod();

        System.out.println(math(10,5));

        System.out.println(newMethod("Dusan"));

        makeMusicians();
    }


    public void makeSimpsons() {
        Simpsons homer = new Simpsons("homer",50, "nuclear");
        System.out.println(homer.getName());
        homer.setName("homer simpsons");
        System.out.println(homer.getName());

    }


    public void makeMusicians(){
        Musicians james = new Musicians("james","guitar",50);
        System.out.println(james.instrument);

    }




    public void testMethod(){
        int x = 4 + 4 ;
      System.out.println("value of x : " + x);
    }

    public int math(int a, int b){
        return a + b ;
    }

    public String newMethod(String string){
        return  string + "newMethod" ;
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause called");
    }


    }

}

