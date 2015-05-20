package com.example

object EitherOption {

  def createOption(create: Boolean): Option[String] =
    if (create)
      Some("value!")
    else
      None

  def optionHasValue(opt: Option[String]): String =
    opt match {
      case Some(value) =>
        value
      case None =>
        "No Value"
    }

  def createEither(create: Boolean): Either[Int, String] =
    if (create)
      Right("value!")
    else
      Left(0)

  def eitherHasValue(either: Either[Int, String]): String =
    either match {
      case Right(value) =>
        value
      case Left(i) =>
        s"No value; got integer: $i"
    }

}
