package com.papsign.ktor.openapigen

import kotlin.reflect.KType
import kotlin.reflect.KVisibility
import kotlin.reflect.full.createType
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.jvm.jvmErasure
import kotlin.reflect.typeOf

val unitKType = getKType<Unit>()

inline fun <reified T> isNullable(): Boolean {
    return null is T
}

inline fun <reified T> getKType() = typeOf<T>()

fun KType.strip(nullable: Boolean = isMarkedNullable): KType {
    return jvmErasure.createType(arguments, nullable)
}
