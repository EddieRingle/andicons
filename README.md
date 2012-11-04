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

<More documentation to follow...>
