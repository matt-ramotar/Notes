package so.howl.common.storekit.api

import so.howl.common.storekit.entities.auth.network.NetworkAuth
import so.howl.common.storekit.result.RequestResult

interface AuthApi {
    suspend fun authenticate(token: String): RequestResult<NetworkAuth>
}