package com.minhokokocrunch.firebaseauthentication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.view.KeyEvent
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth
import org.jetbrains.anko.toast

class HomeActivity : AppCompatActivity() {

    var mAuth: FirebaseAuth? = null
    var mAuthListener: FirebaseAuth.AuthStateListener? = null
    private val TAG:String = "Result Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        mAuthListener = FirebaseAuth.AuthStateListener { firebaseAuth ->
            val users = firebaseAuth.currentUser
            if (users == null) {
                startActivity(Intent(this@HomeActivity, LoginActivity::class.java))
                finish()
            }
        }

        val bt_pf =findViewById<Button>(R.id.bt_pf)

        bt_pf.setOnClickListener {
            val i = Intent(this@HomeActivity, ResultActivity::class.java)
            startActivity(i)

        }

        val bt_toeic =findViewById<Button>(R.id.bt_toeic)

        bt_toeic.setOnClickListener {

            val i = Intent(this@HomeActivity, ToeicActivity::class.java)
            startActivity(i)
        }

        val bt_toefl=findViewById<Button>(R.id.bt_toefl)

        bt_toefl.setOnClickListener {

            val i = Intent(this@HomeActivity, ToeflActivity::class.java)
            startActivity(i)
        }

        val bt_cutep =findViewById<Button>(R.id.bt_cutep)

        bt_cutep.setOnClickListener {

            val i = Intent(this@HomeActivity, CutepActivity::class.java)
            startActivity(i)
        }

        val bt_tuget =findViewById<Button>(R.id.bt_tuget)

        bt_tuget.setOnClickListener {

            val i = Intent(this@HomeActivity, TugetActivity::class.java)
            startActivity(i)
        }

        val bt_ielts =findViewById<Button>(R.id.bt_ielts)

        bt_ielts.setOnClickListener {

            val i = Intent(this@HomeActivity, IeltsActivity::class.java)
            startActivity(i)
        }

    }



}
