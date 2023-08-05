package victor.mendez.umpirecuenta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var strikes: Int = 0
    var balls: Int = 0
    var outs: Int = 0
    var innings: Int = 0

    var btn_balls: Button = findViewById(R.id.bttn_balls)
    var btn_strikes: Button = findViewById(R.id.bttn_strikes)
    var btn_outs: Button = findViewById(R.id.bttn_outs)
    var btn_innings: Button = findViewById(R.id.bttn_innings)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    public fun click_balls(view: View){
        //Toast.makeText(this, "click en sumar bolas", Toast.LENGTH_SHORT).show()
        if(balls == 4){
            balls = 0
        }else {
            balls++
        }

        btn_balls.setText("$balls")
    }

    public fun click_strikes(view: View){
        //Toast.makeText(this, "click en sumar strikes", Toast.LENGTH_SHORT).show()
        if(strikes == 3){
            strikes = 0
            click_outs(view)
        }
        else{
            strikes++
        }

        btn_strikes.setText("$strikes")
    }


    public fun click_outs(view: View){
        //Toast.makeText(this, "click en sumar strikes", Toast.LENGTH_SHORT).show()
        if(outs == 3){
            outs = 0
        }
        else{
            outs++
        }

        btn_outs.setText("$outs")
    }


    public fun click_innings(view: View){
        //Toast.makeText(this, "click en sumar strikes", Toast.LENGTH_SHORT).show()
        if(innings == 9){
            innings = 0
        }
        else{
            innings++
        }

        btn_innings.setText("$innings")
    }

    public fun click_reset() {
        btn_outs.setText("0")
        btn_balls.setText("0")
        btn_innings.setText("0")
        btn_strikes.setText("0")
    }

}