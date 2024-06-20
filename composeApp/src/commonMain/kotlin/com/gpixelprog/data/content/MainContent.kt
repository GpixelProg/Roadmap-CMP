package com.gpixelprog.data.content

import com.gpixelprog.data.models.BoardModel
import com.gpixelprog.data.models.SubcategoryModel
import roadmap_cmp.composeapp.generated.resources.Res
import roadmap_cmp.composeapp.generated.resources.*

object MainContent {
    val titles = listOf(
        "Kotlin Multiplatform Fundamentals",
        "KMP Libraries",
        "KMP Project Structure",
    )

    val kmpFundamentals = listOf(
        //KMP Fundamentals
        BoardModel(
            title = "Kotlin Basics",
            description = "Learn the basics of Kotlin language",
            image = Res.drawable.kotlin_prev,
            subcategories = listOf(
                SubcategoryModel(
                    title = "Get Started",
                    description = "To start with Kotlin",
                    link = "https://kotlinlang.org/docs/getting-started.html"
                ),
                SubcategoryModel(
                    title = "Take Kotlin tour",
                    description = "This tour covers the fundamentals of the Kotlin programming language and can be completed entirely within your browser.",
                    link = "https://kotlinlang.org/docs/kotlin-tour-welcome.html"
                ),
                SubcategoryModel(
                    title = "Learn Kotlin by Example",
                    description = "This is an official set of small and simple annotated examples designed for those new to Kotlin",
                    link = "https://play.kotlinlang.org/byExample/overview"
                )
            )
        ),
        BoardModel(
            title = "Jetpack Compose",
            description = "Creating a declarative UI",
            image = Res.drawable.jetpack_compose_prev,
            subcategories = listOf(
                SubcategoryModel(
                    image = Res.drawable.jc_1,
                    link = "https://developer.android.com/develop/ui/compose/tutorial"
                ),
                SubcategoryModel(
                    image = Res.drawable.jc_2,
                    link = "https://www.youtube.com/watch?v=EOQB8PTLkpY&list=PLWz5rJ2EKKc9Ty3Zl1hvMVUsXfkn93NRk"
                ),
                SubcategoryModel(
                    image = Res.drawable.jc_3,
                    link = "https://github.com/android/compose-samples"
                ),
                SubcategoryModel(
                    image = Res.drawable.jc_4,
                    link = "https://developer.android.com/develop/ui/compose/setup"
                ),
                SubcategoryModel(
                    image = Res.drawable.jc_5,
                    link = "https://developer.android.com/develop/ui/compose/layouts"
                ),
                SubcategoryModel(
                    image = Res.drawable.jc_6,
                    link = "https://developer.android.com/develop/ui/compose/themes"
                ),
                SubcategoryModel(
                    image = Res.drawable.jc_7,
                    link = "https://developer.android.com/develop/ui/compose/state"
                ),
                SubcategoryModel(
                    image = Res.drawable.jc_8,
                    link = "https://developer.android.com/develop/ui/compose/documentation"
                ),
            )
        ),
        BoardModel(
            title = "Kotlin Multiplatform",
            description = "Enables shared code across different platforms.",
            image = Res.drawable.kotlin_multiplatform_prev,
            subcategories = emptyList()
        )
    )

    val kmpLibraries = listOf(
        //KMP Libraries
        BoardModel(
            title = "Ktor client",
            description = "Flexible, asynchronous HTTP client for multiple platforms",
            image = Res.drawable.ktor_prev,
            subcategories = emptyList()
        ),
        BoardModel(
            title = "Kotlinx Serialization",
            description = "Library for Kotlin data serialization to JSON, XML",
            image = Res.drawable.serialization_prev,
            subcategories = emptyList()
        ),
        BoardModel(
            title = "Kotlinx Datetime",
            description = "Multiplatform library for working with date and time",
            image = Res.drawable.datetime_prev,
            subcategories = emptyList()
        ),
        BoardModel(
            title = "Navigation Voyager",
            description = "Multiplatform navigation library",
            image = Res.drawable.voyager_prev,
            subcategories = emptyList()
        ),
        BoardModel(
            title = "Image loading Coil",
            description = "Image loading library for Android, iOS, and Web",
            image = Res.drawable.coil_prev,
            subcategories = emptyList()
        ),
        BoardModel(
            title = "SQLDelight",
            description = "Kotlin multiplatform SQL library for type-safe database access",
            image = Res.drawable.sqldelight_prev,
            subcategories = emptyList()
        ),
    )
}