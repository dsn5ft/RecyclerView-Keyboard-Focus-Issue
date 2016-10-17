# RecyclerView Keyboard Focus Issue

There seems to be a bug that was introduced in version 24.0.0 of the RecyclerView library, and is still in the current
version of the library, which is 24.2.1.

The issue happens when the RecyclerView's height is set to WRAP_CONTENT, and there is an EditText within a row near
the bottom of the screen, and the RecyclerView does not fill the entire screen. When the user taps the EditText to bring
up the keyboard, the keyboard shows and then closes immediately.

It happens when the keyboard covers the entire EditText row, meaning it might be related to the row being recycled,
which would cause the EditText to lose focus and the keyboard to hide. This was not an issue in version 23.4.0 of the
RecyclerView library, even with the RecyclerView's height is set to WRAP_CONTENT.