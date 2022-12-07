package so.howl.common.storekit.store.howler

import so.howl.common.storekit.entities.HowlUserId
import so.howl.common.storekit.entities.HowlerId

sealed class HowlerMarketKey {
    sealed class Read : HowlerMarketKey() {
        data class GetById(val howlerId: HowlerId) : Read()
        data class GetAllByOwnerId(val ownerId: HowlUserId) : Read()
        data class GetNextBatchByHowlerId(val howlerId: HowlerId) : Read()
    }

    sealed class Write : HowlerMarketKey() {
        data class Swipe(val howlerId: HowlerId) : Write()
    }
}