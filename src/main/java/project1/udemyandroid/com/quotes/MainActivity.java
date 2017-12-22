package project1.udemyandroid.com.quotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button quoteButton;
    private TextView quoteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.quoteText);
        quoteButton = findViewById(R.id.showQuoteButton);

        quoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuoteServer server = new QuoteServer();

                quoteTextView.setText(server.getRandomQuote());
            }
        });
    }
}
