package com.nitrogooglesignin

class GoogleSignInException(
  val code: String,
  message: String,
  val userInfo: Map<String, String> = emptyMap(),
) : Exception(message) {
  // Nitro rejects the JS promise with toString() alone, so the code travels in it.
  // GoogleOneTapSignIn parses it back out on the JS side.
  override fun toString(): String = "[$code] $message"
}
