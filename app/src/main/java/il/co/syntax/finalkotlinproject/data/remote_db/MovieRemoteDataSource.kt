package il.co.syntax.finalkotlinproject.data.remote_db

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieRemoteDataSource @Inject constructor(
    private val movieInterface:MovieInterface) : BaseDataSource() {

    suspend fun getMovies(query: String) = getResult { movieInterface.getAllMovies(s=query,page = 1, apikey = "398cdf86") }
    suspend fun getMovie(i : String) = getResult { movieInterface.getMovie(i,apikey = "398cdf86" )}

}