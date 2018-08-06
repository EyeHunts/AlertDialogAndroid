package `in`.eyehunt.alertdialogandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.content.DialogInterface
import android.support.v7.app.AlertDialog
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showdialog(view: View) {

        val alertDialog = AlertDialog.Builder(this)
                //set icon
                .setIcon(android.R.drawable.ic_dialog_alert)
                //set title
                .setTitle("Are you sure to Exit")
                //set message
                .setMessage("If yes then application will close")
                //set positive button
                .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, i ->
                    //set what would happen when positive button is clicked
                    finish()
                })
                //set negative button
                .setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                    //set what should happen when negative button is clicked
                    Toast.makeText(applicationContext, "Nothing Happened", Toast.LENGTH_LONG).show()
                })
                .show()
    }
}
