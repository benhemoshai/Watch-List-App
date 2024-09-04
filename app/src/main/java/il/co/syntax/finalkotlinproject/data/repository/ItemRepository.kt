package il.co.syntax.finalkotlinproject.data.repository


import android.app.Application
import il.co.syntax.finalkotlinproject.data.loca_db.ItemDao
import il.co.syntax.finalkotlinproject.data.loca_db.ItemsDatabase
import il.co.syntax.finalkotlinproject.data.models.Item
import javax.inject.Singleton

@Singleton
class ItemRepository(application: Application) {

    private var itemDao: ItemDao?

    init {
        val db  = ItemsDatabase.getDatabase(application)
        itemDao = db.itemDao()
    }

    fun getItems() = itemDao?.getItems()

    suspend fun addItem(item: Item) {
        itemDao?.addItem(item)
    }
    suspend fun updateItem(item: Item){
        itemDao?.updateItem(item)
    }

    suspend fun deleteItem(item: Item) {
        itemDao?.deleteItem(item)
    }



    suspend fun deleteAll() {
        itemDao?.deleteAll()
    }
}
