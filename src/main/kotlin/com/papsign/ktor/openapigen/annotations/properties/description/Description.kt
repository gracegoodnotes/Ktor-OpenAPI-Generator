package com.papsign.ktor.openapigen.annotations.properties.description

import com.papsign.ktor.openapigen.schema.processor.SchemaProcessorAnnotation

/**
 * Property annotation for providing a description of a schema model property
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.CLASS)
@SchemaProcessorAnnotation(DescriptionProcessor::class)
annotation class Description(val value: String)
