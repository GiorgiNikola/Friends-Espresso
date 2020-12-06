package com.atiurin.ultron.listeners

import android.util.Log
import com.atiurin.ultron.core.common.Operation
import com.atiurin.ultron.core.common.OperationResult
import com.atiurin.ultron.core.config.UltronConfig

class LogLifecycleListener : AbstractLifecycleListener() {
    override fun before(operation: Operation) {
        Log.d(
            UltronConfig.LOGCAT_TAG,
            "Before execution of ${operation.name}."
        )
    }

    override fun <Op: Operation, OpRes : OperationResult<Op>> afterSuccess(operationResult: OpRes) {
        Log.d(
            UltronConfig.LOGCAT_TAG,
            "Successfully executed ${operationResult.operation.name}."
        )
    }

    override fun<Op: Operation, OpRes : OperationResult<Op>>  afterFailure(operationResult: OpRes) {
        Log.d(
            UltronConfig.LOGCAT_TAG, "Failed execution of ${operationResult.operation.name}, " +
                    "description: ${operationResult.description}"
        )
    }
}