package com.zhorateam.priyut

class User(moder: Boolean, n : String, VeryImportantPerson : Boolean, advertisement : Array<Ad>, loginu : String, pass : String) {
    var moderator : Boolean = moder
    var login = loginu
    var password : String = pass
    var vip : Boolean = VeryImportantPerson
    var ads = advertisement
    var name : String = n
}