# DroidCafe
Android fundamentals 04.1: Clickable images

#### Small Improvements in the Coding Challenge
The Coding Challenge for this exercise suggested changing the floating action icon and
using that to start a second, shopping-cart activity. If you've already clicked on
one of the images, its text appears in the shopping cart.  But, if you didn't click on
any image, the shopping cart page says, "Ordered: null," because the tutorial doesn't
include a guard on the message.  So, I added a guard in the on-click handler in MainActivity: if
you haven't ordered anything, it displays a Snack but doesn't open the shopping cart.

#### Some Possible Additional Improvements
Protect the images from multi-clicks. Currently, if you click an image many times,
the toast message gives the illusion of staying up for a long time. Actually, what it is
doing (presumably) is fading out and being redrawn once for each additional click.


