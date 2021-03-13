package space.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class AddEditOne extends AppCompatActivity {
    Button btn_done;
    List<Person> personList;
    EditText et_numberPhone, et_personName;

    MyApplication myApplication = (MyApplication) this.getApplication();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_one);
        btn_done = findViewById(R.id.btn_done);
        personList = myApplication.getPersonList();
        et_numberPhone = findViewById(R.id.et_numberPhone);
        et_personName = findViewById(R.id.et_personName);


        btn_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int nextId = myApplication.getNextId();
                Person newPerson = new Person(Integer.getInteger(et_numberPhone.getText().toString()), et_personName.getText().toString(), nextId);
                personList.add(newPerson);
                myApplication.setNextId(nextId++);

                Intent intent = new Intent(AddEditOne.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}