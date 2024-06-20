package com.gpixelprog.data.models

import org.jetbrains.compose.resources.DrawableResource

data class BoardModel(
    val image: DrawableResource,
    val title: String,
    val description: String,
    val subcategories: List<SubcategoryModel>
)

data class SubcategoryModel(
    val title: String? = null,
    val description: String? = null,
    val image: DrawableResource? = null,
    val link: String
)

/**
 * Not used yet
 */
data class Topic(
    val title: String,
    val content: List<Content>
)

sealed class Content {
    data class Title(val title: String) : Content()
    data class Text(val text: String) : Content()
    data class Image(val url: String) : Content()
    data class Code(val code: String) : Content()
    data class FunctionCall(val function: () -> Unit) : Content()
}