package com.eight.rozhid


import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import java.util.*


class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences:  SharedPreferences
    val myPreferences = "mypref"

    // 1 - В наявності
    // 2 - Наряд
    // 3 - КАЗ
    // 4 - Звільнення
    // 5 - Відпустка
    // 6 - Відрядження
    // 7 - Баня
    var u1 = "1"
    var u2 = "1"
    var u3 = "1"
    var u4 = "1"
    var u5 = "1"
    var u6 = "1"
    var u7 = "1"
    var u8 = "1"
    var u9 = "1"
    var u10 = "1"
    var u11 = "1"
    var u12 = "1"
    var u13 = "1"
    var u14 = "1"
    var u15 = "1"
    var u16 = "1"
    var u17 = "1"
    var u18 = "1"
    var u19 = "1"
    var u20 = "1"
    var u21 = "1"
    var razom_vn : Int = 0
    var razom_n : Int = 0
    var razom_kaz : Int = 0
    var razom_zv : Int = 0
    var razom_v : Int = 0
    var razom_vd : Int = 0
    var razom_b : Int = 0
    var prizvyshaN = ""
    var prizvyshaKAZ = ""
    var prizvyshaZV = ""
    var prizvyshaV = ""
    var prizvyshaVD = ""
    var prizvyshaB = ""
    var rowSize = ""

    // Втановлює текст та колір кнопки
    fun setButtonState (view: TextView, value : String) {
        when (value) {
            "1" -> {view.text = getString(R.string.action_vn); view.setBackgroundResource(R.color.color6) }
            "2" -> {view.text = getString(R.string.action_n); view.setBackgroundResource(R.color.color8) }
            "3" -> {view.text = getString(R.string.action_kaz); view.setBackgroundResource(R.color.color9) }
            "4" -> {view.text = getString(R.string.action_zv); view.setBackgroundResource(R.color.color10) }
            "5" -> {view.text = getString(R.string.action_v); view.setBackgroundResource(R.color.color11) }
            "6" -> {view.text = getString(R.string.action_vd); view.setBackgroundResource(R.color.color12) }
            "7" -> {view.text = getString(R.string.action_b); view.setBackgroundResource(R.color.color14) }
        }
    }




    fun saveData() {
        val editor = sharedPreferences.edit()
        editor.putString("u1",u1)
        editor.putString("u2",u2)
        editor.putString("u3",u3)
        editor.putString("u4",u4)
        editor.putString("u5",u5)
        editor.putString("u6",u6)
        editor.putString("u7",u7)
        editor.putString("u8",u8)
        editor.putString("u9",u9)
        editor.putString("u10",u10)
        editor.putString("u11",u11)
        editor.putString("u12",u12)
        editor.putString("u13",u13)
        editor.putString("u14",u14)
        editor.putString("u15",u15)
        editor.putString("u16",u16)
        editor.putString("u17",u17)
        editor.putString("u18",u18)
        editor.putString("u19",u19)
        editor.putString("u20",u20)
        editor.putString("u21",u21)
        editor.putString("prizvyshaN",prizvyshaN)
        editor.putString("prizvyshaKAZ",prizvyshaKAZ)
        editor.putString("prizvyshaZV",prizvyshaZV)
        editor.putString("prizvyshaV",prizvyshaV)
        editor.putString("prizvyshaVD",prizvyshaVD)
        editor.putString("prizvyshaB",prizvyshaB)
        editor.putInt("razom_vn",razom_vn)
        editor.putInt("razom_n",razom_n)
        editor.putInt("razom_kaz",razom_kaz)
        editor.putInt("razom_zv",razom_zv)
        editor.putInt("razom_v",razom_v)
        editor.putInt("razom_vd",razom_vd)
        editor.putInt("razom_b",razom_b)
        editor.putString("rowSize",rowSize)
        editor.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Прибираємо рядок меню
        getSupportActionBar()?.hide();

        // Збереження налаштувань
        sharedPreferences = getSharedPreferences(myPreferences, Context.MODE_PRIVATE)

        //Toast.makeText(this@MainActivity,"You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
        val tvRazom = findViewById<TextView>(R.id.tvRazom)

        val buttonCheckBoxClear = findViewById<TextView>(R.id.buttonCheckBoxClear)
        val button0 = findViewById<TextView>(R.id.button0)
        val button1 = findViewById<TextView>(R.id.button1)
        val button2 = findViewById<TextView>(R.id.button2)
        val button3 = findViewById<TextView>(R.id.button3)
        val button4 = findViewById<TextView>(R.id.button4)
        val button5 = findViewById<TextView>(R.id.button5)
        val button6 = findViewById<TextView>(R.id.button6)
        val button7 = findViewById<TextView>(R.id.button7)
        val button8 = findViewById<TextView>(R.id.button8)
        val button9 = findViewById<TextView>(R.id.button9)
        val button10 = findViewById<TextView>(R.id.button10)
        val button11 = findViewById<TextView>(R.id.button11)
        val button12 = findViewById<TextView>(R.id.button12)
        val button13 = findViewById<TextView>(R.id.button13)
        val button14 = findViewById<TextView>(R.id.button14)
        val button15 = findViewById<TextView>(R.id.button15)
        val button16 = findViewById<TextView>(R.id.button16)
        val button17 = findViewById<TextView>(R.id.button17)
        val button18 = findViewById<TextView>(R.id.button18)
        val button19 = findViewById<TextView>(R.id.button19)
        val button20 = findViewById<TextView>(R.id.button20)
        val button21 = findViewById<TextView>(R.id.button21)
        val checkBox1 = findViewById<CheckBox>(R.id.checkBox1)
        val checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        val checkBox3 = findViewById<CheckBox>(R.id.checkBox3)
        val checkBox4 = findViewById<CheckBox>(R.id.checkBox4)
        val checkBox5 = findViewById<CheckBox>(R.id.checkBox5)
        val checkBox6 = findViewById<CheckBox>(R.id.checkBox6)
        val checkBox7 = findViewById<CheckBox>(R.id.checkBox7)
        val checkBox8 = findViewById<CheckBox>(R.id.checkBox8)
        val checkBox9 = findViewById<CheckBox>(R.id.checkBox9)
        val checkBox10 = findViewById<CheckBox>(R.id.checkBox10)
        val checkBox11 = findViewById<CheckBox>(R.id.checkBox11)
        val checkBox12 = findViewById<CheckBox>(R.id.checkBox12)
        val checkBox13 = findViewById<CheckBox>(R.id.checkBox13)
        val checkBox14 = findViewById<CheckBox>(R.id.checkBox14)
        val checkBox15 = findViewById<CheckBox>(R.id.checkBox15)
        val checkBox16 = findViewById<CheckBox>(R.id.checkBox16)
        val checkBox17 = findViewById<CheckBox>(R.id.checkBox17)
        val checkBox18 = findViewById<CheckBox>(R.id.checkBox18)
        val checkBox19 = findViewById<CheckBox>(R.id.checkBox19)
        val checkBox20 = findViewById<CheckBox>(R.id.checkBox20)
        val checkBox21 = findViewById<CheckBox>(R.id.checkBox21)
        val ivMenuButton = findViewById<ImageView>(R.id.ivMenuButton)
        val row1 = findViewById<LinearLayout>(R.id.row1)
        val row2 = findViewById<LinearLayout>(R.id.row2)
        val row3 = findViewById<LinearLayout>(R.id.row3)
        val row4 = findViewById<LinearLayout>(R.id.row4)
        val row5 = findViewById<LinearLayout>(R.id.row5)
        val row6 = findViewById<LinearLayout>(R.id.row6)
        val row7 = findViewById<LinearLayout>(R.id.row7)
        val row8 = findViewById<LinearLayout>(R.id.row8)
        val row9 = findViewById<LinearLayout>(R.id.row9)
        val row10 = findViewById<LinearLayout>(R.id.row10)
        val row11 = findViewById<LinearLayout>(R.id.row11)
        val row12 = findViewById<LinearLayout>(R.id.row12)
        val row13 = findViewById<LinearLayout>(R.id.row13)
        val row14 = findViewById<LinearLayout>(R.id.row14)
        val row15 = findViewById<LinearLayout>(R.id.row15)
        val row16 = findViewById<LinearLayout>(R.id.row16)
        val row17 = findViewById<LinearLayout>(R.id.row17)
        val row18 = findViewById<LinearLayout>(R.id.row18)
        val row19 = findViewById<LinearLayout>(R.id.row19)
        val row20 = findViewById<LinearLayout>(R.id.row20)
        val row21 = findViewById<LinearLayout>(R.id.row21)


        fun readData() {
            sharedPreferences = getSharedPreferences(myPreferences, Context.MODE_PRIVATE)
            if (sharedPreferences.contains("u1")) { u1 = sharedPreferences.getString("u1","1").toString(); setButtonState(button1, u1) }
            if (sharedPreferences.contains("u2")) { u2 = sharedPreferences.getString("u2","1").toString(); setButtonState(button2, u2) }
            if (sharedPreferences.contains("u3")) { u3 = sharedPreferences.getString("u3","1").toString(); setButtonState(button3, u3) }
            if (sharedPreferences.contains("u4")) { u4 = sharedPreferences.getString("u4","1").toString(); setButtonState(button4, u4) }
            if (sharedPreferences.contains("u5")) { u5 = sharedPreferences.getString("u5","1").toString(); setButtonState(button5, u5) }
            if (sharedPreferences.contains("u6")) { u6 = sharedPreferences.getString("u6","1").toString(); setButtonState(button6, u6) }
            if (sharedPreferences.contains("u7")) { u7 = sharedPreferences.getString("u7","1").toString(); setButtonState(button7, u7) }
            if (sharedPreferences.contains("u8")) { u8 = sharedPreferences.getString("u8","1").toString(); setButtonState(button8, u8) }
            if (sharedPreferences.contains("u9")) { u9 = sharedPreferences.getString("u9","1").toString(); setButtonState(button9, u9) }
            if (sharedPreferences.contains("u10")) { u10 = sharedPreferences.getString("u10","1").toString(); setButtonState(button10, u10) }
            if (sharedPreferences.contains("u11")) { u11 = sharedPreferences.getString("u11","1").toString(); setButtonState(button11, u11) }
            if (sharedPreferences.contains("u12")) { u12 = sharedPreferences.getString("u12","1").toString(); setButtonState(button12, u12) }
            if (sharedPreferences.contains("u13")) { u13 = sharedPreferences.getString("u13","1").toString(); setButtonState(button13, u13) }
            if (sharedPreferences.contains("u14")) { u14 = sharedPreferences.getString("u14","1").toString(); setButtonState(button14, u14) }
            if (sharedPreferences.contains("u15")) { u15 = sharedPreferences.getString("u15","1").toString(); setButtonState(button15, u15) }
            if (sharedPreferences.contains("u16")) { u16 = sharedPreferences.getString("u16","1").toString(); setButtonState(button16, u16) }
            if (sharedPreferences.contains("u17")) { u17 = sharedPreferences.getString("u17","1").toString(); setButtonState(button17, u17) }
            if (sharedPreferences.contains("u18")) { u18 = sharedPreferences.getString("u18","1").toString(); setButtonState(button18, u18) }
            if (sharedPreferences.contains("u19")) { u19 = sharedPreferences.getString("u19","1").toString(); setButtonState(button19, u19) }
            if (sharedPreferences.contains("u20")) { u20 = sharedPreferences.getString("u20","1").toString(); setButtonState(button20, u20) }
            if (sharedPreferences.contains("u21")) { u21 = sharedPreferences.getString("u21","1").toString(); setButtonState(button21, u21) }
            if (sharedPreferences.contains("prizvyshaN")) prizvyshaN = sharedPreferences.getString("prizvyshaN","").toString()
            if (sharedPreferences.contains("prizvyshaKAZ")) prizvyshaKAZ = sharedPreferences.getString("prizvyshaKAZ","").toString()
            if (sharedPreferences.contains("prizvyshaZV")) prizvyshaZV = sharedPreferences.getString("prizvyshaZV","").toString()
            if (sharedPreferences.contains("prizvyshaV")) prizvyshaV = sharedPreferences.getString("prizvyshaV","").toString()
            if (sharedPreferences.contains("prizvyshaVD")) prizvyshaVD = sharedPreferences.getString("prizvyshaVD","").toString()
            if (sharedPreferences.contains("prizvyshaB")) prizvyshaB = sharedPreferences.getString("prizvyshaB","").toString()
            if (sharedPreferences.contains("razom_vn")) razom_vn = sharedPreferences.getInt("razom_vn",0)
            if (sharedPreferences.contains("razom_n")) razom_n = sharedPreferences.getInt("razom_n",0)
            if (sharedPreferences.contains("razom_kaz")) razom_kaz = sharedPreferences.getInt("razom_kaz",0)
            if (sharedPreferences.contains("razom_zv")) razom_zv = sharedPreferences.getInt("razom_zv",0)
            if (sharedPreferences.contains("razom_v")) razom_v = sharedPreferences.getInt("razom_v",0)
            if (sharedPreferences.contains("razom_vd")) razom_vd = sharedPreferences.getInt("razom_vd",0)
            if (sharedPreferences.contains("razom_b")) razom_b = sharedPreferences.getInt("razom_b",0)
            if (sharedPreferences.contains("rowSize")) rowSize = sharedPreferences.getString("rowSize","").toString()
        }

        
        // Метод підбиває загальну кількість
        fun razom() {
            razom_vn = 0
            razom_n = 0
            razom_kaz = 0
            razom_zv = 0
            razom_v = 0
            razom_vd = 0
            razom_b = 0
            prizvyshaN = ""
            prizvyshaKAZ = ""
            prizvyshaZV = ""
            prizvyshaV = ""
            prizvyshaVD = ""
            prizvyshaB = ""
            when(u1) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += getString(R.string.user1)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += getString(R.string.user1)}
                "4" -> {razom_zv += 1; prizvyshaZV += getString(R.string.user1)}
                "5" -> {razom_v += 1; prizvyshaV += getString(R.string.user1)}
                "6" -> {razom_vd += 1; prizvyshaVD += getString(R.string.user1)}
                "7" -> {razom_b += 1; prizvyshaB += getString(R.string.user1)}
            }
            when(u2) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user2) else ", " + getString(R.string.user2)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user2) else ", " + getString(R.string.user2)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user2) else ", " + getString(R.string.user2)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user2) else ", " + getString(R.string.user2)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user2) else ", " + getString(R.string.user2)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user2) else ", " + getString(R.string.user2)}
            }
            when(u3) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user3) else ", " + getString(R.string.user3)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user3) else ", " + getString(R.string.user3)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user3) else ", " + getString(R.string.user3)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user3) else ", " + getString(R.string.user3)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user3) else ", " + getString(R.string.user3)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user3) else ", " + getString(R.string.user3)}
            }
            when(u4) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user4) else ", " + getString(R.string.user4)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user4) else ", " + getString(R.string.user4)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user4) else ", " + getString(R.string.user4)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user4) else ", " + getString(R.string.user4)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user4) else ", " + getString(R.string.user4)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user4) else ", " + getString(R.string.user4)}
            }
            when(u5) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user5) else ", " + getString(R.string.user5)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user5) else ", " + getString(R.string.user5)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user5) else ", " + getString(R.string.user5)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user5) else ", " + getString(R.string.user5)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user5) else ", " + getString(R.string.user5)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user5) else ", " + getString(R.string.user5)}
            }
            when(u6) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user6) else ", " + getString(R.string.user6)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user6) else ", " + getString(R.string.user6)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user6) else ", " + getString(R.string.user6)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user6) else ", " + getString(R.string.user6)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user6) else ", " + getString(R.string.user6)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user6) else ", " + getString(R.string.user6)}
            }
            when(u7) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user7) else ", " + getString(R.string.user7)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user7) else ", " + getString(R.string.user7)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user7) else ", " + getString(R.string.user7)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user7) else ", " + getString(R.string.user7)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user7) else ", " + getString(R.string.user7)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user7) else ", " + getString(R.string.user7)}
            }
            when(u8) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user8) else ", " + getString(R.string.user8)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user8) else ", " + getString(R.string.user8)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user8) else ", " + getString(R.string.user8)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user8) else ", " + getString(R.string.user8)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user8) else ", " + getString(R.string.user8)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user8) else ", " + getString(R.string.user8)}
            }
            when(u9) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user9) else ", " + getString(R.string.user9)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user9) else ", " + getString(R.string.user9)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user9) else ", " + getString(R.string.user9)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user9) else ", " + getString(R.string.user9)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user9) else ", " + getString(R.string.user9)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user9) else ", " + getString(R.string.user9)}
            }
            when(u10) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user10) else ", " + getString(R.string.user10)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user10) else ", " + getString(R.string.user10)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user10) else ", " + getString(R.string.user10)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user10) else ", " + getString(R.string.user10)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user10) else ", " + getString(R.string.user10)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user10) else ", " + getString(R.string.user10)}
            }
            when(u11) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user11) else ", " + getString(R.string.user11)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user11) else ", " + getString(R.string.user11)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user11) else ", " + getString(R.string.user11)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user11) else ", " + getString(R.string.user11)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user11) else ", " + getString(R.string.user11)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user11) else ", " + getString(R.string.user11)}
            }
            when(u12) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user12) else ", " + getString(R.string.user12)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user12) else ", " + getString(R.string.user12)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user12) else ", " + getString(R.string.user12)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user12) else ", " + getString(R.string.user12)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user12) else ", " + getString(R.string.user12)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user12) else ", " + getString(R.string.user12)}
            }
            when(u13) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user13) else ", " + getString(R.string.user13)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user13) else ", " + getString(R.string.user13)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user13) else ", " + getString(R.string.user13)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user13) else ", " + getString(R.string.user13)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user13) else ", " + getString(R.string.user13)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user13) else ", " + getString(R.string.user13)}
            }
            when(u14) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user14) else ", " + getString(R.string.user14)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user14) else ", " + getString(R.string.user14)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user14) else ", " + getString(R.string.user14)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user14) else ", " + getString(R.string.user14)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user14) else ", " + getString(R.string.user14)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user14) else ", " + getString(R.string.user14)}
            }
            when(u15) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user15) else ", " + getString(R.string.user15)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user15) else ", " + getString(R.string.user15)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user15) else ", " + getString(R.string.user15)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user15) else ", " + getString(R.string.user15)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user15) else ", " + getString(R.string.user15)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user15) else ", " + getString(R.string.user15)}
            }
            when(u16) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user16) else ", " + getString(R.string.user16)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user16) else ", " + getString(R.string.user16)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user16) else ", " + getString(R.string.user16)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user16) else ", " + getString(R.string.user16)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user16) else ", " + getString(R.string.user16)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user16) else ", " + getString(R.string.user16)}
            }
            when(u17) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user17) else ", " + getString(R.string.user17)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user17) else ", " + getString(R.string.user17)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user17) else ", " + getString(R.string.user17)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user17) else ", " + getString(R.string.user17)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user17) else ", " + getString(R.string.user17)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user17) else ", " + getString(R.string.user17)}
            }
            when(u18) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user18) else ", " + getString(R.string.user18)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user18) else ", " + getString(R.string.user18)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user18) else ", " + getString(R.string.user18)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user18) else ", " + getString(R.string.user18)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user18) else ", " + getString(R.string.user18)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user18) else ", " + getString(R.string.user18)}
            }
            when(u19) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user19) else ", " + getString(R.string.user19)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user19) else ", " + getString(R.string.user19)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user19) else ", " + getString(R.string.user19)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user19) else ", " + getString(R.string.user19)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user19) else ", " + getString(R.string.user19)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user19) else ", " + getString(R.string.user19)}
            }
            when(u20) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user20) else ", " + getString(R.string.user20)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user20) else ", " + getString(R.string.user20)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user20) else ", " + getString(R.string.user20)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user20) else ", " + getString(R.string.user20)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user20) else ", " + getString(R.string.user20)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user20) else ", " + getString(R.string.user20)}
            }
            when(u21) {
                "1" -> razom_vn += 1
                "2" -> {razom_n += 1; prizvyshaN += if (razom_n == 1) getString(R.string.user21) else ", " + getString(R.string.user21)}
                "3" -> {razom_kaz += 1; prizvyshaKAZ += if (razom_kaz == 1) getString(R.string.user21) else ", " + getString(R.string.user21)}
                "4" -> {razom_zv += 1; prizvyshaZV += if (razom_zv == 1) getString(R.string.user21) else ", " + getString(R.string.user21)}
                "5" -> {razom_v += 1; prizvyshaV += if (razom_v == 1) getString(R.string.user21) else ", " + getString(R.string.user21)}
                "6" -> {razom_vd += 1; prizvyshaVD += if (razom_vd == 1) getString(R.string.user21) else ", " + getString(R.string.user21)}
                "7" -> {razom_b += 1; prizvyshaB += if (razom_b == 1) getString(R.string.user21) else ", " + getString(R.string.user21)}
            }
            var razomPretext = "З/с - 21"
            if (razom_n > 0) razomPretext += "\nН - $razom_n" + " ($prizvyshaN)"
            if (razom_kaz > 0) razomPretext += "\nКаз - $razom_kaz" + " ($prizvyshaKAZ)"
            if (razom_zv > 0) razomPretext += "\nЗв - $razom_zv" + " ($prizvyshaZV)"
            if (razom_v > 0) razomPretext += "\nВп - $razom_v" + " ($prizvyshaV)"
            if (razom_vd > 0) razomPretext += "\nВд - $razom_vd" + " ($prizvyshaVD)"
            if (razom_b > 0) razomPretext += "\nБаня - $razom_b" + " ($prizvyshaB)"
            razomPretext += "\nВ/н - $razom_vn"
            tvRazom.text = razomPretext
        }

        readData()
        razom()

        // Функція міняє чек-бокс в потрібний статус
        fun checkBoxChange(chB: CheckBox, checked: Boolean, enabled: Boolean) {
            if (checked) chB.isChecked = true
            if (!checked) chB.isChecked = false
            if (enabled) chB.isVisible = true
            if (!enabled) chB.isVisible = false
        }
        fun checkBoxChange(chB: CheckBox, checked: Boolean) {
            if (checked) chB.isChecked = true
            if (!checked) chB.isChecked = false
        }

        // Обробка натискання кнопки ОЧИСТИТИ CHEK BOX'и для тимчасової перевірки
        buttonCheckBoxClear.setOnClickListener {
            checkBoxChange(checkBox1, checked = false)
            checkBoxChange(checkBox2, checked = false)
            checkBoxChange(checkBox3, checked = false)
            checkBoxChange(checkBox4, checked = false)
            checkBoxChange(checkBox5, checked = false)
            checkBoxChange(checkBox6, checked = false)
            checkBoxChange(checkBox7, checked = false)
            checkBoxChange(checkBox8, checked = false)
            checkBoxChange(checkBox9, checked = false)
            checkBoxChange(checkBox10, checked = false)
            checkBoxChange(checkBox11, checked = false)
            checkBoxChange(checkBox12, checked = false)
            checkBoxChange(checkBox13, checked = false)
            checkBoxChange(checkBox14, checked = false)
            checkBoxChange(checkBox15, checked = false)
            checkBoxChange(checkBox16, checked = false)
            checkBoxChange(checkBox17, checked = false)
            checkBoxChange(checkBox18, checked = false)
            checkBoxChange(checkBox19, checked = false)
            checkBoxChange(checkBox20, checked = false)
            checkBoxChange(checkBox21, checked = false)
        }

        // Обробка натискання кнопки ОЧИСТИТИ
             button0.setOnClickListener {
                 tvRazom.text = "З/с - 21\nВ/н - 21"
                 u1 = "1"; u2 = "1"; u3 = "1"; u4 = "1"; u5 = "1"; u6 = "1"; u7 = "1"; u8 = "1"; u9 = "1"; u10 = "1";
                 u11 = "1";u12 = "1"; u13 = "1"; u14 = "1"; u15 = "1"; u16 = "1"; u17 = "1"; u18 = "1";u19 = "1"; u20 = "1"; u21 = "1"
                 button1.text = getString(R.string.action_vn)
                 button2.text = getString(R.string.action_vn)
                 button3.text = getString(R.string.action_vn)
                 button4.text = getString(R.string.action_vn)
                 button5.text = getString(R.string.action_vn)
                 button6.text = getString(R.string.action_vn)
                 button7.text = getString(R.string.action_vn)
                 button8.text = getString(R.string.action_vn)
                 button9.text = getString(R.string.action_vn)
                 button10.text = getString(R.string.action_vn)
                 button11.text = getString(R.string.action_vn)
                 button12.text = getString(R.string.action_vn)
                 button13.text = getString(R.string.action_vn)
                 button14.text = getString(R.string.action_vn)
                 button15.text = getString(R.string.action_vn)
                 button16.text = getString(R.string.action_vn)
                 button17.text = getString(R.string.action_vn)
                 button18.text = getString(R.string.action_vn)
                 button19.text = getString(R.string.action_vn)
                 button20.text = getString(R.string.action_vn)
                 button21.text = getString(R.string.action_vn)
                 button1.setBackgroundResource(R.color.color6)
                 button2.setBackgroundResource(R.color.color6)
                 button3.setBackgroundResource(R.color.color6)
                 button4.setBackgroundResource(R.color.color6)
                 button5.setBackgroundResource(R.color.color6)
                 button6.setBackgroundResource(R.color.color6)
                 button7.setBackgroundResource(R.color.color6)
                 button8.setBackgroundResource(R.color.color6)
                 button9.setBackgroundResource(R.color.color6)
                 button10.setBackgroundResource(R.color.color6)
                 button11.setBackgroundResource(R.color.color6)
                 button12.setBackgroundResource(R.color.color6)
                 button13.setBackgroundResource(R.color.color6)
                 button14.setBackgroundResource(R.color.color6)
                 button15.setBackgroundResource(R.color.color6)
                 button16.setBackgroundResource(R.color.color6)
                 button17.setBackgroundResource(R.color.color6)
                 button18.setBackgroundResource(R.color.color6)
                 button19.setBackgroundResource(R.color.color6)
                 button20.setBackgroundResource(R.color.color6)
                 button21.setBackgroundResource(R.color.color6)
                 checkBoxChange(checkBox1, checked = false, enabled = true)
                 checkBoxChange(checkBox2, checked = false, enabled = true)
                 checkBoxChange(checkBox3, checked = false, enabled = true)
                 checkBoxChange(checkBox4, checked = false, enabled = true)
                 checkBoxChange(checkBox5, checked = false, enabled = true)
                 checkBoxChange(checkBox6, checked = false, enabled = true)
                 checkBoxChange(checkBox7, checked = false, enabled = true)
                 checkBoxChange(checkBox8, checked = false, enabled = true)
                 checkBoxChange(checkBox9, checked = false, enabled = true)
                 checkBoxChange(checkBox10, checked = false, enabled = true)
                 checkBoxChange(checkBox11, checked = false, enabled = true)
                 checkBoxChange(checkBox12, checked = false, enabled = true)
                 checkBoxChange(checkBox13, checked = false, enabled = true)
                 checkBoxChange(checkBox14, checked = false, enabled = true)
                 checkBoxChange(checkBox15, checked = false, enabled = true)
                 checkBoxChange(checkBox16, checked = false, enabled = true)
                 checkBoxChange(checkBox17, checked = false, enabled = true)
                 checkBoxChange(checkBox18, checked = false, enabled = true)
                 checkBoxChange(checkBox19, checked = false, enabled = true)
                 checkBoxChange(checkBox20, checked = false, enabled = true)
                 checkBoxChange(checkBox21, checked = false, enabled = true)
            }

        // Обробка натискання кнопки 1
        button1.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button1)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button1.text = getString(R.string.action_vn)
                        button1.setBackgroundResource(R.color.color6)
                        u1 = "1"
                        razom()
                        checkBoxChange(checkBox1, checked = false, enabled = true)
                        }
                    R.id.action_n -> {
                        button1.text = getString(R.string.action_n)
                        button1.setBackgroundResource(R.color.color8)
                        u1 = "2"
                        razom()
                        checkBoxChange(checkBox1, checked = false, enabled = false)
                        }
                    R.id.action_kaz -> {
                        button1.text = getString(R.string.action_kaz)
                        button1.setBackgroundResource(R.color.color9)
                        u1 = "3"
                        razom()
                        checkBoxChange(checkBox1, checked = false, enabled = false)
                        }
                    R.id.action_zv -> {
                        button1.text = getString(R.string.action_zv)
                        button1.setBackgroundResource(R.color.color10)
                        u1 = "4"
                        razom()
                        checkBoxChange(checkBox1, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button1.text = getString(R.string.action_v)
                        button1.setBackgroundResource(R.color.color11)
                        u1 = "5"
                        razom()
                        checkBoxChange(checkBox1, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button1.text = getString(R.string.action_vd)
                        button1.setBackgroundResource(R.color.color12)
                        u1 = "6"
                        razom()
                        checkBoxChange(checkBox1, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button1.text = getString(R.string.action_b)
                        button1.setBackgroundResource(R.color.color14)
                        u1 = "7"
                        razom()
                        checkBoxChange(checkBox1, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }

        // Обробка натискання кнопки 2
        button2.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button2)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button2.text = getString(R.string.action_vn)
                        button2.setBackgroundResource(R.color.color6)
                        u2 = "1"
                        razom()
                        checkBoxChange(checkBox2, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button2.text = getString(R.string.action_n)
                        button2.setBackgroundResource(R.color.color8)
                        u2 = "2"
                        razom()
                        checkBoxChange(checkBox2, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button2.text = getString(R.string.action_kaz)
                        button2.setBackgroundResource(R.color.color9)
                        u2 = "3"
                        razom()
                        checkBoxChange(checkBox2, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button2.text = getString(R.string.action_zv)
                        button2.setBackgroundResource(R.color.color10)
                        u2 = "4"
                        razom()
                        checkBoxChange(checkBox2, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button2.text = getString(R.string.action_v)
                        button2.setBackgroundResource(R.color.color11)
                        u2 = "5"
                        razom()
                        checkBoxChange(checkBox2, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button2.text = getString(R.string.action_vd)
                        button2.setBackgroundResource(R.color.color12)
                        u2 = "6"
                        razom()
                        checkBoxChange(checkBox2, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button2.text = getString(R.string.action_b)
                        button2.setBackgroundResource(R.color.color14)
                        u1 = "7"
                        razom()
                        checkBoxChange(checkBox2, checked = false, enabled = false)
                    }
                }

                true
            })
            razom()
            popupMenu.show()
        }

        // Обробка натискання кнопки 3
        button3.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button3)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button3.text = getString(R.string.action_vn)
                        button3.setBackgroundResource(R.color.color6)
                        u3 = "1"
                        razom()
                        checkBoxChange(checkBox3, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button3.text = getString(R.string.action_n)
                        button3.setBackgroundResource(R.color.color8)
                        u3 = "2"
                        razom()
                        checkBoxChange(checkBox3, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button3.text = getString(R.string.action_kaz)
                        button3.setBackgroundResource(R.color.color9)
                        u3 = "3"
                        razom()
                        checkBoxChange(checkBox3, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button3.text = getString(R.string.action_zv)
                        button3.setBackgroundResource(R.color.color10)
                        u3 = "4"
                        razom()
                        checkBoxChange(checkBox3, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button3.text = getString(R.string.action_v)
                        button3.setBackgroundResource(R.color.color11)
                        u3 = "5"
                        razom()
                        checkBoxChange(checkBox3, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button3.text = getString(R.string.action_vd)
                        button3.setBackgroundResource(R.color.color12)
                        u3 = "6"
                        razom()
                        checkBoxChange(checkBox3, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button3.text = getString(R.string.action_b)
                        button3.setBackgroundResource(R.color.color14)
                        u3 = "7"
                        razom()
                        checkBoxChange(checkBox3, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }

        // Обробка натискання кнопки 4
        button4.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button4)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button4.text = getString(R.string.action_vn)
                        button4.setBackgroundResource(R.color.color6)
                        u4 = "1"
                        razom()
                        checkBoxChange(checkBox4, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button4.text = getString(R.string.action_n)
                        button4.setBackgroundResource(R.color.color8)
                        u4 = "2"
                        razom()
                        checkBoxChange(checkBox4, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button4.text = getString(R.string.action_kaz)
                        button4.setBackgroundResource(R.color.color9)
                        u4 = "3"
                        razom()
                        checkBoxChange(checkBox4, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button4.text = getString(R.string.action_zv)
                        button4.setBackgroundResource(R.color.color10)
                        u4 = "4"
                        razom()
                        checkBoxChange(checkBox4, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button4.text = getString(R.string.action_v)
                        button4.setBackgroundResource(R.color.color11)
                        u4 = "5"
                        razom()
                        checkBoxChange(checkBox4, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button4.text = getString(R.string.action_vd)
                        button4.setBackgroundResource(R.color.color12)
                        u4 = "6"
                        razom()
                        checkBoxChange(checkBox4, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button4.text = getString(R.string.action_b)
                        button4.setBackgroundResource(R.color.color14)
                        u4 = "7"
                        razom()
                        checkBoxChange(checkBox4, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }

        // Обробка натискання кнопки 5
        button5.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button5)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button5.text = getString(R.string.action_vn)
                        button5.setBackgroundResource(R.color.color6)
                        u5 = "1"
                        razom()
                        checkBoxChange(checkBox5, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button5.text = getString(R.string.action_n)
                        button5.setBackgroundResource(R.color.color8)
                        u5 = "2"
                        razom()
                        checkBoxChange(checkBox5, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button5.text = getString(R.string.action_kaz)
                        button5.setBackgroundResource(R.color.color9)
                        u5 = "3"
                        razom()
                        checkBoxChange(checkBox5, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button5.text = getString(R.string.action_zv)
                        button5.setBackgroundResource(R.color.color10)
                        u5 = "4"
                        razom()
                        checkBoxChange(checkBox5, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button5.text = getString(R.string.action_v)
                        button5.setBackgroundResource(R.color.color11)
                        u5 = "5"
                        razom()
                        checkBoxChange(checkBox5, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button5.text = getString(R.string.action_vd)
                        button5.setBackgroundResource(R.color.color12)
                        u5 = "6"
                        razom()
                        checkBoxChange(checkBox5, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button5.text = getString(R.string.action_b)
                        button5.setBackgroundResource(R.color.color14)
                        u5 = "7"
                        razom()
                        checkBoxChange(checkBox5, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }

        // Обробка натискання кнопки 6
        button6.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button6)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button6.text = getString(R.string.action_vn)
                        button6.setBackgroundResource(R.color.color6)
                        u6 = "1"
                        razom()
                        checkBoxChange(checkBox6, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button6.text = getString(R.string.action_n)
                        button6.setBackgroundResource(R.color.color8)
                        u6 = "2"
                        razom()
                        checkBoxChange(checkBox6, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button6.text = getString(R.string.action_kaz)
                        button6.setBackgroundResource(R.color.color9)
                        u6 = "3"
                        razom()
                        checkBoxChange(checkBox6, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button6.text = getString(R.string.action_zv)
                        button6.setBackgroundResource(R.color.color10)
                        u6 = "4"
                        razom()
                        checkBoxChange(checkBox6, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button6.text = getString(R.string.action_v)
                        button6.setBackgroundResource(R.color.color11)
                        u6 = "5"
                        razom()
                        checkBoxChange(checkBox6, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button6.text = getString(R.string.action_vd)
                        button6.setBackgroundResource(R.color.color12)
                        u6 = "6"
                        razom()
                        checkBoxChange(checkBox6, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button6.text = getString(R.string.action_b)
                        button6.setBackgroundResource(R.color.color14)
                        u6 = "7"
                        razom()
                        checkBoxChange(checkBox6, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }

        // Обробка натискання кнопки 7
        button7.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button7)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button7.text = getString(R.string.action_vn)
                        button7.setBackgroundResource(R.color.color6)
                        u7 = "1"
                        razom()
                        checkBoxChange(checkBox7, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button7.text = getString(R.string.action_n)
                        button7.setBackgroundResource(R.color.color8)
                        u7 = "2"
                        razom()
                        checkBoxChange(checkBox7, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button7.text = getString(R.string.action_kaz)
                        button7.setBackgroundResource(R.color.color9)
                        u7 = "3"
                        razom()
                        checkBoxChange(checkBox7, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button7.text = getString(R.string.action_zv)
                        button7.setBackgroundResource(R.color.color10)
                        u7 = "4"
                        razom()
                        checkBoxChange(checkBox7, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button7.text = getString(R.string.action_v)
                        button7.setBackgroundResource(R.color.color11)
                        u7 = "5"
                        razom()
                        checkBoxChange(checkBox7, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button7.text = getString(R.string.action_vd)
                        button7.setBackgroundResource(R.color.color12)
                        u7 = "6"
                        razom()
                        checkBoxChange(checkBox7, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button7.text = getString(R.string.action_b)
                        button7.setBackgroundResource(R.color.color14)
                        u7 = "7"
                        razom()
                        checkBoxChange(checkBox7, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }

        // Обробка натискання кнопки 8
        button8.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button8)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button8.text = getString(R.string.action_vn)
                        button8.setBackgroundResource(R.color.color6)
                        u8 = "1"
                        razom()
                        checkBoxChange(checkBox8, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button8.text = getString(R.string.action_n)
                        button8.setBackgroundResource(R.color.color8)
                        u8 = "2"
                        razom()
                        checkBoxChange(checkBox8, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button8.text = getString(R.string.action_kaz)
                        button8.setBackgroundResource(R.color.color9)
                        u8 = "3"
                        razom()
                        checkBoxChange(checkBox8, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button8.text = getString(R.string.action_zv)
                        button8.setBackgroundResource(R.color.color10)
                        u8 = "4"
                        razom()
                        checkBoxChange(checkBox8, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button8.text = getString(R.string.action_v)
                        button8.setBackgroundResource(R.color.color11)
                        u8 = "5"
                        razom()
                        checkBoxChange(checkBox8, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button8.text = getString(R.string.action_vd)
                        button8.setBackgroundResource(R.color.color12)
                        u8 = "6"
                        razom()
                        checkBoxChange(checkBox8, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button8.text = getString(R.string.action_b)
                        button8.setBackgroundResource(R.color.color14)
                        u8 = "7"
                        razom()
                        checkBoxChange(checkBox8, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }

        // Обробка натискання кнопки 9
        button9.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button9)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button9.text = getString(R.string.action_vn)
                        button9.setBackgroundResource(R.color.color6)
                        u9 = "1"
                        razom()
                        checkBoxChange(checkBox9, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button9.text = getString(R.string.action_n)
                        button9.setBackgroundResource(R.color.color8)
                        u9 = "2"
                        razom()
                        checkBoxChange(checkBox9, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button9.text = getString(R.string.action_kaz)
                        button9.setBackgroundResource(R.color.color9)
                        u9 = "3"
                        razom()
                        checkBoxChange(checkBox9, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button9.text = getString(R.string.action_zv)
                        button9.setBackgroundResource(R.color.color10)
                        u9 = "4"
                        razom()
                        checkBoxChange(checkBox9, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button9.text = getString(R.string.action_v)
                        button9.setBackgroundResource(R.color.color11)
                        u9 = "5"
                        razom()
                        checkBoxChange(checkBox9, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button9.text = getString(R.string.action_vd)
                        button9.setBackgroundResource(R.color.color12)
                        u9 = "6"
                        razom()
                        checkBoxChange(checkBox9, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button9.text = getString(R.string.action_b)
                        button9.setBackgroundResource(R.color.color14)
                        u9 = "7"
                        razom()
                        checkBoxChange(checkBox9, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }

        // Обробка натискання кнопки 10
        button10.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button10)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button10.text = getString(R.string.action_vn)
                        button10.setBackgroundResource(R.color.color6)
                        u10 = "1"
                        razom()
                        checkBoxChange(checkBox10, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button10.text = getString(R.string.action_n)
                        button10.setBackgroundResource(R.color.color8)
                        u10 = "2"
                        razom()
                        checkBoxChange(checkBox10, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button10.text = getString(R.string.action_kaz)
                        button10.setBackgroundResource(R.color.color9)
                        u10 = "3"
                        razom()
                        checkBoxChange(checkBox10, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button10.text = getString(R.string.action_zv)
                        button10.setBackgroundResource(R.color.color10)
                        u10 = "4"
                        razom()
                        checkBoxChange(checkBox10, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button10.text = getString(R.string.action_v)
                        button10.setBackgroundResource(R.color.color11)
                        u10 = "5"
                        razom()
                        checkBoxChange(checkBox10, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button10.text = getString(R.string.action_vd)
                        button10.setBackgroundResource(R.color.color12)
                        u10 = "6"
                        razom()
                        checkBoxChange(checkBox10, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button10.text = getString(R.string.action_b)
                        button10.setBackgroundResource(R.color.color14)
                        u10 = "7"
                        razom()
                        checkBoxChange(checkBox10, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }

        // Обробка натискання кнопки 11
        button11.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button11)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button11.text = getString(R.string.action_vn)
                        button11.setBackgroundResource(R.color.color6)
                        u11 = "1"
                        razom()
                        checkBoxChange(checkBox11, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button11.text = getString(R.string.action_n)
                        button11.setBackgroundResource(R.color.color8)
                        u11 = "2"
                        razom()
                        checkBoxChange(checkBox11, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button11.text = getString(R.string.action_kaz)
                        button11.setBackgroundResource(R.color.color9)
                        u11 = "3"
                        razom()
                        checkBoxChange(checkBox11, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button11.text = getString(R.string.action_zv)
                        button11.setBackgroundResource(R.color.color10)
                        u11 = "4"
                        razom()
                        checkBoxChange(checkBox11, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button11.text = getString(R.string.action_v)
                        button11.setBackgroundResource(R.color.color11)
                        u11 = "5"
                        razom()
                        checkBoxChange(checkBox11, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button11.text = getString(R.string.action_vd)
                        button11.setBackgroundResource(R.color.color12)
                        u11 = "6"
                        razom()
                        checkBoxChange(checkBox11, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button11.text = getString(R.string.action_b)
                        button11.setBackgroundResource(R.color.color14)
                        u11 = "7"
                        razom()
                        checkBoxChange(checkBox11, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }

        // Обробка натискання кнопки 12
        button12.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button12)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button12.text = getString(R.string.action_vn)
                        button12.setBackgroundResource(R.color.color6)
                        u12 = "1"
                        razom()
                        checkBoxChange(checkBox12, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button12.text = getString(R.string.action_n)
                        button12.setBackgroundResource(R.color.color8)
                        u12 = "2"
                        razom()
                        checkBoxChange(checkBox12, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button12.text = getString(R.string.action_kaz)
                        button12.setBackgroundResource(R.color.color9)
                        u12 = "3"
                        razom()
                        checkBoxChange(checkBox12, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button12.text = getString(R.string.action_zv)
                        button12.setBackgroundResource(R.color.color10)
                        u12 = "4"
                        razom()
                        checkBoxChange(checkBox12, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button12.text = getString(R.string.action_v)
                        button12.setBackgroundResource(R.color.color11)
                        u12 = "5"
                        razom()
                        checkBoxChange(checkBox12, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button12.text = getString(R.string.action_vd)
                        button12.setBackgroundResource(R.color.color12)
                        u12 = "6"
                        razom()
                        checkBoxChange(checkBox12, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button12.text = getString(R.string.action_b)
                        button12.setBackgroundResource(R.color.color14)
                        u12 = "7"
                        razom()
                        checkBoxChange(checkBox12, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }

        // Обробка натискання кнопки 13
        button13.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button13)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button13.text = getString(R.string.action_vn)
                        button13.setBackgroundResource(R.color.color6)
                        u13 = "1"
                        razom()
                        checkBoxChange(checkBox13, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button13.text = getString(R.string.action_n)
                        button13.setBackgroundResource(R.color.color8)
                        u13 = "2"
                        razom()
                        checkBoxChange(checkBox13, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button13.text = getString(R.string.action_kaz)
                        button13.setBackgroundResource(R.color.color9)
                        u13 = "3"
                        razom()
                        checkBoxChange(checkBox13, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button13.text = getString(R.string.action_zv)
                        button13.setBackgroundResource(R.color.color10)
                        u13 = "4"
                        razom()
                        checkBoxChange(checkBox13, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button13.text = getString(R.string.action_v)
                        button13.setBackgroundResource(R.color.color11)
                        u13 = "5"
                        razom()
                        checkBoxChange(checkBox13, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button13.text = getString(R.string.action_vd)
                        button13.setBackgroundResource(R.color.color12)
                        u13 = "6"
                        razom()
                        checkBoxChange(checkBox13, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button13.text = getString(R.string.action_b)
                        button13.setBackgroundResource(R.color.color14)
                        u13 = "7"
                        razom()
                        checkBoxChange(checkBox13, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }

        // Обробка натискання кнопки 14
        button14.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button14)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button14.text = getString(R.string.action_vn)
                        button14.setBackgroundResource(R.color.color6)
                        u14 = "1"
                        razom()
                        checkBoxChange(checkBox14, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button14.text = getString(R.string.action_n)
                        button14.setBackgroundResource(R.color.color8)
                        u14 = "2"
                        razom()
                        checkBoxChange(checkBox14, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button14.text = getString(R.string.action_kaz)
                        button14.setBackgroundResource(R.color.color9)
                        u14 = "3"
                        razom()
                        checkBoxChange(checkBox14, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button14.text = getString(R.string.action_zv)
                        button14.setBackgroundResource(R.color.color10)
                        u14 = "4"
                        razom()
                        checkBoxChange(checkBox14, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button14.text = getString(R.string.action_v)
                        button14.setBackgroundResource(R.color.color11)
                        u14 = "5"
                        razom()
                        checkBoxChange(checkBox14, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button14.text = getString(R.string.action_vd)
                        button14.setBackgroundResource(R.color.color12)
                        u14 = "6"
                        razom()
                        checkBoxChange(checkBox14, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button14.text = getString(R.string.action_b)
                        button14.setBackgroundResource(R.color.color14)
                        u14 = "7"
                        razom()
                        checkBoxChange(checkBox14, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }

        // Обробка натискання кнопки 15
        button15.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button15)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button15.text = getString(R.string.action_vn)
                        button15.setBackgroundResource(R.color.color6)
                        u15 = "1"
                        razom()
                        checkBoxChange(checkBox15, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button15.text = getString(R.string.action_n)
                        button15.setBackgroundResource(R.color.color8)
                        u15 = "2"
                        razom()
                        checkBoxChange(checkBox15, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button15.text = getString(R.string.action_kaz)
                        button15.setBackgroundResource(R.color.color9)
                        u15 = "3"
                        razom()
                        checkBoxChange(checkBox15, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button15.text = getString(R.string.action_zv)
                        button15.setBackgroundResource(R.color.color10)
                        u15 = "4"
                        razom()
                        checkBoxChange(checkBox15, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button15.text = getString(R.string.action_v)
                        button15.setBackgroundResource(R.color.color11)
                        u15 = "5"
                        razom()
                        checkBoxChange(checkBox15, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button15.text = getString(R.string.action_vd)
                        button15.setBackgroundResource(R.color.color12)
                        u15 = "6"
                        razom()
                        checkBoxChange(checkBox15, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button15.text = getString(R.string.action_b)
                        button15.setBackgroundResource(R.color.color14)
                        u15 = "7"
                        razom()
                        checkBoxChange(checkBox15, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }

        // Обробка натискання кнопки 16
        button16.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button16)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button16.text = getString(R.string.action_vn)
                        button16.setBackgroundResource(R.color.color6)
                        u16 = "1"
                        razom()
                        checkBoxChange(checkBox16, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button16.text = getString(R.string.action_n)
                        button16.setBackgroundResource(R.color.color8)
                        u16 = "2"
                        razom()
                        checkBoxChange(checkBox16, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button16.text = getString(R.string.action_kaz)
                        button16.setBackgroundResource(R.color.color9)
                        u16 = "3"
                        razom()
                        checkBoxChange(checkBox16, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button16.text = getString(R.string.action_zv)
                        button16.setBackgroundResource(R.color.color10)
                        u16 = "4"
                        razom()
                        checkBoxChange(checkBox16, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button16.text = getString(R.string.action_v)
                        button16.setBackgroundResource(R.color.color11)
                        u16 = "5"
                        razom()
                        checkBoxChange(checkBox16, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button16.text = getString(R.string.action_vd)
                        button16.setBackgroundResource(R.color.color12)
                        u16 = "6"
                        razom()
                        checkBoxChange(checkBox16, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button16.text = getString(R.string.action_b)
                        button16.setBackgroundResource(R.color.color14)
                        u16 = "7"
                        razom()
                        checkBoxChange(checkBox16, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }

        // Обробка натискання кнопки 17
        button17.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button17)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button17.text = getString(R.string.action_vn)
                        button17.setBackgroundResource(R.color.color6)
                        u17 = "1"
                        razom()
                        checkBoxChange(checkBox17, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button17.text = getString(R.string.action_n)
                        button17.setBackgroundResource(R.color.color8)
                        u17 = "2"
                        razom()
                        checkBoxChange(checkBox17, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button17.text = getString(R.string.action_kaz)
                        button17.setBackgroundResource(R.color.color9)
                        u17 = "3"
                        razom()
                        checkBoxChange(checkBox17, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button17.text = getString(R.string.action_zv)
                        button17.setBackgroundResource(R.color.color10)
                        u17 = "4"
                        razom()
                        checkBoxChange(checkBox17, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button17.text = getString(R.string.action_v)
                        button17.setBackgroundResource(R.color.color11)
                        u17 = "5"
                        razom()
                        checkBoxChange(checkBox17, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button17.text = getString(R.string.action_vd)
                        button17.setBackgroundResource(R.color.color12)
                        u17 = "6"
                        razom()
                        checkBoxChange(checkBox17, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button17.text = getString(R.string.action_b)
                        button17.setBackgroundResource(R.color.color14)
                        u17 = "7"
                        razom()
                        checkBoxChange(checkBox17, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }

        // Обробка натискання кнопки 18
        button18.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button18)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button18.text = getString(R.string.action_vn)
                        button18.setBackgroundResource(R.color.color6)
                        u18 = "1"
                        razom()
                        checkBoxChange(checkBox18, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button18.text = getString(R.string.action_n)
                        button18.setBackgroundResource(R.color.color8)
                        u18 = "2"
                        razom()
                        checkBoxChange(checkBox18, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button18.text = getString(R.string.action_kaz)
                        button18.setBackgroundResource(R.color.color9)
                        u18 = "3"
                        razom()
                        checkBoxChange(checkBox18, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button18.text = getString(R.string.action_zv)
                        button18.setBackgroundResource(R.color.color10)
                        u18 = "4"
                        razom()
                        checkBoxChange(checkBox18, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button18.text = getString(R.string.action_v)
                        button18.setBackgroundResource(R.color.color11)
                        u18 = "5"
                        razom()
                        checkBoxChange(checkBox18, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button18.text = getString(R.string.action_vd)
                        button18.setBackgroundResource(R.color.color12)
                        u18 = "6"
                        razom()
                        checkBoxChange(checkBox18, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button18.text = getString(R.string.action_b)
                        button18.setBackgroundResource(R.color.color14)
                        u18 = "7"
                        razom()
                        checkBoxChange(checkBox18, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }

        // Обробка натискання кнопки 19
        button19.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button19)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button19.text = getString(R.string.action_vn)
                        button19.setBackgroundResource(R.color.color6)
                        u19 = "1"
                        razom()
                        checkBoxChange(checkBox19, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button19.text = getString(R.string.action_n)
                        button19.setBackgroundResource(R.color.color8)
                        u19 = "2"
                        razom()
                        checkBoxChange(checkBox19, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button19.text = getString(R.string.action_kaz)
                        button19.setBackgroundResource(R.color.color9)
                        u19 = "3"
                        razom()
                        checkBoxChange(checkBox19, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button19.text = getString(R.string.action_zv)
                        button19.setBackgroundResource(R.color.color10)
                        u19 = "4"
                        razom()
                        checkBoxChange(checkBox19, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button19.text = getString(R.string.action_v)
                        button19.setBackgroundResource(R.color.color11)
                        u19 = "5"
                        razom()
                        checkBoxChange(checkBox19, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button19.text = getString(R.string.action_vd)
                        button19.setBackgroundResource(R.color.color12)
                        u19 = "6"
                        razom()
                        checkBoxChange(checkBox19, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button19.text = getString(R.string.action_b)
                        button19.setBackgroundResource(R.color.color14)
                        u19 = "7"
                        razom()
                        checkBoxChange(checkBox19, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }

        // Обробка натискання кнопки 20
        button20.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button20)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button20.text = getString(R.string.action_vn)
                        button20.setBackgroundResource(R.color.color6)
                        u20 = "1"
                        razom()
                        checkBoxChange(checkBox20, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button20.text = getString(R.string.action_n)
                        button20.setBackgroundResource(R.color.color8)
                        u20 = "2"
                        razom()
                        checkBoxChange(checkBox20, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button20.text = getString(R.string.action_kaz)
                        button20.setBackgroundResource(R.color.color9)
                        u20 = "3"
                        razom()
                        checkBoxChange(checkBox20, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button20.text = getString(R.string.action_zv)
                        button20.setBackgroundResource(R.color.color10)
                        u20 = "4"
                        razom()
                        checkBoxChange(checkBox20, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button20.text = getString(R.string.action_v)
                        button20.setBackgroundResource(R.color.color11)
                        u20 = "5"
                        razom()
                        checkBoxChange(checkBox20, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button20.text = getString(R.string.action_vd)
                        button20.setBackgroundResource(R.color.color12)
                        u20 = "6"
                        razom()
                        checkBoxChange(checkBox20, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button20.text = getString(R.string.action_b)
                        button20.setBackgroundResource(R.color.color14)
                        u20 = "7"
                        razom()
                        checkBoxChange(checkBox20, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }

        // Обробка натискання кнопки 21
        button21.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button21)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_vn -> {
                        button21.text = getString(R.string.action_vn)
                        button21.setBackgroundResource(R.color.color6)
                        u21 = "1"
                        razom()
                        checkBoxChange(checkBox21, checked = false, enabled = true)
                    }
                    R.id.action_n -> {
                        button21.text = getString(R.string.action_n)
                        button21.setBackgroundResource(R.color.color8)
                        u21 = "2"
                        razom()
                        checkBoxChange(checkBox21, checked = false, enabled = false)
                    }
                    R.id.action_kaz -> {
                        button21.text = getString(R.string.action_kaz)
                        button21.setBackgroundResource(R.color.color9)
                        u21 = "3"
                        razom()
                        checkBoxChange(checkBox21, checked = false, enabled = false)
                    }
                    R.id.action_zv -> {
                        button21.text = getString(R.string.action_zv)
                        button21.setBackgroundResource(R.color.color10)
                        u21 = "4"
                        razom()
                        checkBoxChange(checkBox21, checked = false, enabled = false)
                    }
                    R.id.action_v -> {
                        button21.text = getString(R.string.action_v)
                        button21.setBackgroundResource(R.color.color11)
                        u21 = "5"
                        razom()
                        checkBoxChange(checkBox21, checked = false, enabled = false)
                    }
                    R.id.action_vd -> {
                        button21.text = getString(R.string.action_vd)
                        button21.setBackgroundResource(R.color.color12)
                        u21 = "6"
                        razom()
                        checkBoxChange(checkBox21, checked = false, enabled = false)
                    }
                    R.id.action_b -> {
                        button21.text = getString(R.string.action_b)
                        button21.setBackgroundResource(R.color.color14)
                        u21 = "7"
                        razom()
                        checkBoxChange(checkBox21, checked = false, enabled = false)
                    }
                }
                true
            })
            popupMenu.show()
        }
        tvRazom.setOnClickListener {
            val i = Intent(Intent.ACTION_SEND)
            i.setPackage("org.thoughtcrime.securesms")
            i.type = "text/plain"
            i.putExtra(Intent.EXTRA_TEXT, tvRazom.text)
            startActivity(i);
        }

        // Обробка натискання кнопки МЕНЮ
        ivMenuButton.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,ivMenuButton)
            popupMenu.menuInflater.inflate(R.menu.menu_main,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.menuSetRowTiny -> {
                        rowSize = "tiny"
                    }
                    R.id.menuSetRowWide -> {
                        rowSize = "wide"
                    }
                }
                true
            })
            popupMenu.show()
        }
    }

    override fun onPause() {
        super.onPause()
        saveData()
        Log.d("Збереження","saveData")
    }
}

