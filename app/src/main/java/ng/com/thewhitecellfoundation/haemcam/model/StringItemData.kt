package ng.com.thewhitecellfoundation.haemcam.model

data class StringItemData(val str: String, var id: Long = 0, val selected: Boolean = false) {
    companion object {
        var staticId = 0.toLong()
    }
    init {
        id = ++staticId
    }
}
