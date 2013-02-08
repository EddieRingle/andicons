Andicons
========

A neat little Android library for using font-based glyphs as drawables and bitmaps
in your Android applications!  

Built-in Support
----------------

Currently, the Andicons library provides the base AndiconView class as well as
implementations for the following glyph sets:

* OcticonView -> [Octicons](https://github.com/styleguide/css/7.0)
* FontAwesomeView -> [Font Awesome](http://fortawesome.github.com/Font-Awesome/)

Using & Such
------------

I'm a fan of git submodules (and IntelliJ), so in order to use this library I recommend adding
this repository as a submodule of your encompassing project's repository:  

    git submodule add git://github.com/eddieringle/andicons contrib/andicons

Now add the Andicons library as a module in IntelliJ and add that module as a dependency of
your project. You're then ready to start using Andicons!

Andicons does not provide the actual TrueType font files per se. It's up to you to get
permission (if needed) to use these sets as well as track down the file for inclusion
in your application.

You can add Andicons programmatically or directly into layouts, like so:

    <com.github.eddieringle.android.libs.andicons.sets.FontAwesomeView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@id/fontawesome_leaf"
            android:textColor="@color/android_green"
            android:textSize="64sp" />

The above would result in this (don't mind the other bits, I just threw this example into another application I'm working on because I was lazy):

<img src="https://dl.dropbox.com/u/3274458/Android/foa/2012-11-04%2015.36.37.png" alt="Layout result" height="75%" />

<More documentation to follow...>
