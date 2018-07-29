package kzeedesigns.peerkamil1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class scndhalf extends AppCompatActivity {
    PDFView pdfView;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scndhalf);
        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("peer.pdf")
       .pages(280,281,282,283,284,285,286,287,288,289,290,
               291,292,293,394,295,296,297,298,299,300,
               301,302,303,304,305,306,307,308,309,310,
               311,312,313,314,315,316,317,318,319,320,
               321,322,323,324,325,326,327,328,329,330,
               331,332,333,334,335,336,337,338,339,340,
               341,342,343,344,345,346,347,348,349,350,
               351,352,353,354,355,356,357,358,359,360,
               361,362,363,364,365,366,367,368,369,370,
               371,372,373,374,375,376,377,378,379,380,
               381,382,383,384,385,386,387,388,389,390,
               391,392,393,394,395,396,397,398,399,400,
               401,402,403,404,405,406,407,408,409, 410,
               411,412,413,414,415,416,417,418,419,420,
               421,422,423,424,425,426,427,428,429,430,
               431,432,433,434,435,436,437,438,439,440,
               441,442,443,444,445,446,447,448,449,450,
               451,452,453,454,455,456,457,458,459,460,
               461,462,463,464,465,466,467,468,469,470,
               471,472,473,474,475,476,477,478,479,480,
               481,482,483,484,485,486,487,488,489,490,
               491,492,493,494,495,496,497,498,499,500,
               501,502,503,504,505,506,507,508,509,510,
               511,512,513,514,515,516,517,518,519,520,
               521,522,523,524,525,526,527,528,529,530,
               531,532,533,534,535,536,537,538,539,540,
               541,542,543,544,545,546,547,548,549,550,
               551,552,553,554,555,556,557,558,559

        ) // all pages are displayed by default
                .defaultPage(0)// allows to draw something on the current page, usually visible in the middle of the screen
                .load();

        AdView mAdView =findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

// Prepare the Interstitial Ad
        interstitial = new InterstitialAd(scndhalf.this);
// Insert the Ad Unit ID
        interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));

        interstitial.loadAd(adRequest);
// Prepare an Interstitial Ad Listener
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
                // Call displayInterstitial() function
                displayInterstitial();
            }
        });
    }
    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }
}