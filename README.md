    
Forked from https://github.com/akash-rayate/abRc-Gmail_like_progressbar 
    
Info from the original repo:
    
     abRc-Gmail-like-progressbar
     ===========================

     Progress Bar, called as ButteryProgressBar by Google used in Gmail application.

     Recently with release of Android 4.4 a.k.a. Android Kit-Kat. They reused lots of code from Gmail to make default email      client application. While going through android source code, found this very interesting class, ButteryProgressBar.java      that can be reused to show progress bar in Gmail application.

    Original Source can be found here     https://android.googlesource.com/platform/packages/apps/UnifiedEmail/+/kitkQ-release/src/com/android/mail/ui/ButteryProgressBar.java

    This class can be used in Android 3.0 and above without any code change, as this custom progress bar uses value      animator, which is introduced in Android 3.0.

    To use this progress bar with Android 2.x project's, use 'jake wharton nine old androids library+IBk- (https://github.com/JakeWharton/NineOldAndroids) to replace Android value animator.
  


I modfied the code to add SwipeRefreshLayout and a message of "Pull Down To Refresh" to the code.
Screenshots: https://github.com/pauldmps/Gmail-like-Pull-Down-to-Refresh/wiki/Screenshots

I was not able to implement Gmail-like "Swipe to refresh" message being displyed on the action bar itself. If you can implement it using short amount of code, send a pull request.

    Usage:
    
    Requires API Level 11 (Android 3.0 Honeycomb) or later.
    Requires Android.Support.v4 & Android.Support.v7.AppCompat libraries to be referenced in the project.
    
    The MainActivity.java contains the bare minimum code required to implement this. Tweak as necessary.
    Do not modify the ButteryProgressBar.java or SwipeRefreshHintLayout.java.
    
    You need colors.xml & attrs.xml in your project. Also the layout of your activity must contain the following:
    
      <com.pauldmps.GmailLikePullDownToRefresh.SwipeRefreshHintLayout
        android:id="@+id/swipe_hint"
        android:layout_width="match_parent"
        android:layout_height="0dp">
        
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:text="Swipe Down To Refresh"/>

        <!-- Any other view positioned using RelativeLayout rules -->

    </com.pauldmps.GmailLikePullDownToRefresh.SwipeRefreshHintLayout>
    
    In the above code, replace the package name to your project, if necessary.
    Also put your listView inside :
        
        <android.support.v4.widget.SwipeRefreshLayout
        android:id="@+id/swipe_container"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
 
        </android.support.v4.widget.SwipeRefreshLayout>
    tags.
    
    To start the animation, call the object to ButteryProgressBar.java that you implement as:
         
         progressBar.setVisibility(View.VISIBLE);
         
    Similarily, to stop the animation, call 
         progressBar.setVisibility(View.INVISIBLE);
         
