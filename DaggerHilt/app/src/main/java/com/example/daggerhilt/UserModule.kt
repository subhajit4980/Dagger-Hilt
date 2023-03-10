package com.example.daggerhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

/*
level of the components
1.singleton components (Application level)
2.Activity components (Activity level)
3.Fragment components (Fragment level)

*/
// we need this annotation also for fragment
//@InstallIn(FragmentComponent::class)


// we need this annotation also for singleton components as it is top level component so all components are accessible
@InstallIn(SingletonComponent::class)

@Module
/*
class userModule {

//     this will provides firebase class which is not directly accessible
    @Provides
    fun providesusersRepo():UserRepo{
        return FirebaseRepo()
    }
}

 */

/*abstract class userModule {

//     this will provides SQLrepo class which is not directly accessible
    @Binds
    abstract fun providesusersRepo(sqlRepo: SQLRepo):UserRepo
}
 */

 class UserModule {
    //     this will provides sql class which is not directly accessible
    @Provides
    @SQLqualifier  // it will provide the sql repo without any confusion
    fun ProvidessqlRepo(sqlRepo: SQLRepo):UserRepo{
        return sqlRepo
    }
    //     this will provides firebase class which is not directly accessible
    @Provides
    @FirebaseQualifier // it will provide the firebase repo without any confusion
    fun ProvidesfirebaseRepo():UserRepo{
        return FirebaseRepo()
    }
}