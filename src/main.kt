fun main()
{
var x=webDeveloper()
    x.info()
}

open class emloyee(name:String,age:Int,salary:String)
{
var name:String=""
    var age:Int=0

    open fun info(){}

}

class  webDeveloper: emloyee("RASHEED",22,"2000")
{
    override fun info() {

    }
}
class  androidDeveloper:emloyee("AYMEN",23,"23000")
{
    override fun info() {

    }
}
class iosDevloper:emloyee("AHMED",24,"62000")
{
    override fun info() {

    }
}