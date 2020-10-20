package com.example.agregarcontacto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Calendar;
import java.util.concurrent.ArrayBlockingQueue;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    class fecha extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        //public static final int DatePicker_datePickerMode();
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {

            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {

        }
    }
     private void fecha; {
        DialogFragment newFragment = new fecha();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }


      class siguiente implements View.OnClickListener{
        @Override
        public void onClick(View view){
            Intent intent = new Intent (MainActivity.this,ConfirmarDatos.class);
            //intent.putExtra (getResources().getString(R.string.pnombre),);
           //intent.putExtra(getResources().getString(R.string.pfecha));
            //intent.putExtra(getResources().getString(R.string.ptelefono));
            //intent.putExtra(getResources().getString(R.string.pcorreo));
            //intent.putExtra(getResources().getString(R.string.pdescripcion));
           //startActivity(intent);

        }
    }



    //ver como puedo tener otro intent por el return?


}