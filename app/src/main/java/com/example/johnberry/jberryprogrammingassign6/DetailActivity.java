package com.example.johnberry.jberryprogrammingassign6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;



public class DetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView selectionBanner = (TextView) findViewById(R.id.selectionBanner);
        TextView detailText = (TextView) findViewById(R.id.detailText);
        ImageView image = (ImageView) findViewById(R.id.imageView);

        String selection = getIntent().getStringExtra("SELECTION");

        switch (selection) {

            case "Rock N Roll Hall of Fame": {
                System.out.println("In Switch Rock");
                selectionBanner.setText(selection);
                detailText.setText("Located on the shore of Lake Erie in downtown Cleveland, Ohio," +
                        "recognizes and archives the history of the best-known and most influential artists, " +
                        "producers, engineers, and other notable figures who have had" +
                        "some major influence on the development of rock and roll. " +
                        "The Rock and Roll Hall of Fame Foundation was established on April 20, 1983, " +
                        "by Atlantic Records founder and chairman Ahmet Ertegun. In 1986, Cleveland was chosen as " +
                        "the Hall of Fame's permanent home.");
                image.setImageResource(R.drawable.rock);
                break;
            }

            case "Lakeview Cemetery": {
                selectionBanner.setText(selection);
                detailText.setText("Lake View Cemetery is on the east side of Cleveland, Ohio, " +
                        "along the East Cleveland and Cleveland Heights borders. " +
                        "More than 104,000 people are buried at Lake View,[1] with more " +
                        "than 700 burials each year. There are 70 acres (0.28 km2) remaining for future development. " +
                        "Known locally as Cleveland's Outdoor Museum, Lake View Cemetery is home to the James A. Garfield " +
                        "Memorial, Wade Memorial Chapel, which features an interior designed by Louis Tiffany, " +
                        "as well as an 80,000,000 gallon capacity concrete-filled dam.");

                image.setImageResource(R.drawable.lakeview);

                break;
            }


            case "Progressive Field": {
                selectionBanner.setText(selection);
                detailText.setText("Progressive Field is a baseball park located in the downtown area " +
                        "of Cleveland, Ohio, United States. It is the home field of the Cleveland Indians " +
                        "of Major League Baseball and, together with Quicken Loans Arena, is part of the " +
                        "Gateway Sports and Entertainment Complex.[8] It was ranked as Major League Baseball's " +
                        "best ballpark in a 2008 Sports Illustrated fan opinion poll. The ballpark opened as " +
                        "Jacobs Field in 1994 to replace Cleveland Stadium, which the team had " +
                        "shared with the Cleveland Browns of the National Football League.");
                image.setImageResource(R.drawable.prog);
                break;
            }
            case "Edgewater Park": {
                selectionBanner.setText(selection);
                detailText.setText("The 147 acre Edgewater Park is the westernmost " +
                        "park in Cleveland Metroparks Lakefront Reservation. " +
                        "Edgewater Park features 9000 feet of shoreline, dog and " +
                        "swim beaches, boat ramps, fishing pier, picnic areas and grills, " +
                        "and a rentable pavilion."
                );
                image.setImageResource(R.drawable.edgewater);
                break;
            }

            case "Capitol Theater": {
                selectionBanner.setText(selection);
                detailText.setText("The Capitol Theatre, established in 1921, has had many ups and downs " +
                        "over the decades, but today remains an economic driver of Cleveland’s " +
                        "Gordon Square Arts District. After suffering extensive water damage, " +
                        "the theatre was restored and reopened by DSCDO in 2009.");
                image.setImageResource(R.drawable.capitol);
                break;
            }

            case "Playhouse Square": {
                selectionBanner.setText(selection);
                detailText.setText("Playhouse Square is a theater district in downtown Cleveland, Ohio. " +
                        "It is the largest performing arts center in the United States outside of New York. " +
                        "(Only Lincoln Center in New York City is larger.) Constructed in a span of 19 months " +
                        "in the early 1920s, the theaters were subsequently closed down, but were revived " +
                        "through a grassroots effort. Their renovation and reopening helped usher in a new " +
                        "era of downtown revitalization in Cleveland, and was called 'one of the top ten " +
                        "successes in Cleveland history'.");
                image.setImageResource(R.drawable.playhouse);
                break;
            }

            case "Little Italy": {
                selectionBanner.setText(selection);
                detailText.setText("Little Italy began in 1895 when immigrant Joseph Carabelli saw " +
                        "the need for monument work in Cleveland's Lakeview Cemetery and established " +
                        "what soon became the city's leading marble and granite works. Local Cleveland " +
                        "industrial billionaire John D. Rockefeller took a special liking to the Italian " +
                        "immigrants of the neighborhood and commissioned the building of the community " +
                        "center Alta House, named after his daughter Alta Rockefeller Prentice, in 1900. " +
                        "Little Italy is also home to the first Italian restaurant to open in the State of " +
                        "Ohio, Guarino's.");
                image.setImageResource(R.drawable.italy);
                break;
            }
        }
    }
    public void onBackPressed(){
        TextView detailText = (TextView) findViewById(R.id.detailText);

        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}