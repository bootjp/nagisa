package mizuki.audience

interface CreativeInterface {
    var enableSyncRequest:Boolean
    val enablePassback:Boolean
    val script:String
    val height:Int
    val width:Int
    val Id:Long

    fun get(): CreativeInterface

}
