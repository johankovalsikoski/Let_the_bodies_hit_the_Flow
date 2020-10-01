package johan.kovalsikoski.letthebodieshittheflow

import android.app.Application
import johan.kovalsikoski.letthebodieshittheflow.di.homeModule
import johan.kovalsikoski.letthebodieshittheflow.di.peopleRepositoryModule
import johan.kovalsikoski.letthebodieshittheflow.di.peopleServiceModule
import johan.kovalsikoski.letthebodieshittheflow.di.retrofitModule
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(
                retrofitModule,
                peopleServiceModule,
                peopleRepositoryModule,
                homeModule
            )
        }
    }

}
