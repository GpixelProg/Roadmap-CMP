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
                ),
                SubcategoryModel(
                    title = "Coroutines guide",
                    description = "This guide covers the basics of coroutines and how to use them in Kotlin",
                    link = "https://kotlinlang.org/docs/coroutines-guide.html"
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
            subcategories = listOf(
                SubcategoryModel(
                    title = "Introduction to Kotlin Multiplatform",
                    link = "https://kotlinlang.org/docs/multiplatform-get-started.html"
                ),
                SubcategoryModel(
                    title = "The basics of Kotlin Multiplatform project structure",
                    link = "https://kotlinlang.org/docs/multiplatform-discover-project.html"
                ),
                SubcategoryModel(
                    title = "Advanced concepts of the multiplatform project structure",
                    link = "https://kotlinlang.org/docs/multiplatform-advanced-project-structure.html"
                ),
                SubcategoryModel(
                    title = "Set up targets for Kotlin Multiplatform",
                    link = "https://kotlinlang.org/docs/multiplatform-set-up-targets.html"
                ),
                SubcategoryModel(
                    title = "Share code on platforms",
                    link = "https://kotlinlang.org/docs/multiplatform-share-on-platforms.html"
                ),
                SubcategoryModel(
                    title = "Expected and actual declarations",
                    link = "https://kotlinlang.org/docs/multiplatform-expect-actual.html"
                ),
                SubcategoryModel(
                    title = "Hierarchical project structure",
                    link = "https://kotlinlang.org/docs/multiplatform-hierarchy.html"
                ),
                SubcategoryModel(
                    title = "Adding dependencies on multiplatform libraries",
                    link = "https://kotlinlang.org/docs/multiplatform-add-dependencies.html"
                ),
                SubcategoryModel(
                    title = "Adding Android dependencies",
                    link = "https://kotlinlang.org/docs/multiplatform-android-dependencies.html"
                ),
                SubcategoryModel(
                    title = "Adding iOS dependencies",
                    link = "https://kotlinlang.org/docs/multiplatform-ios-dependencies.html"
                )
            )
        )
    )

    val kmpLibraries = listOf(
        //KMP Libraries
        BoardModel(
            title = "Ktor client",
            description = "Flexible, asynchronous HTTP client for multiple platforms",
            image = Res.drawable.ktor_prev,
            subcategories = listOf(
                SubcategoryModel(
                    title = "Create a client application",
                    link = "https://ktor.io/docs/client-create-new-application.html"
                ),
                SubcategoryModel(
                    title = "Creating a cross-platform mobile application",
                    link = "https://ktor.io/docs/client-create-multiplatform-application.html"
                ),
                SubcategoryModel(
                    title = "Making requests",
                    link = "https://ktor.io/docs/client-requests.html"
                ),
                SubcategoryModel(
                    title = "Type-safe requests",
                    link = "https://ktor.io/docs/client-resources.html"
                ),
                SubcategoryModel(
                    title = "Default request",
                    link = "https://ktor.io/docs/client-default-request.html"
                ),
                SubcategoryModel(
                    title = "Receiving responses",
                    link = "https://ktor.io/docs/client-responses.html"
                ),
                SubcategoryModel(
                    title = "Response validation",
                    link = "https://ktor.io/docs/client-response-validation.html"
                ),
                SubcategoryModel(
                    title = "Content negotiation and serialization",
                    link = "https://ktor.io/docs/client-serialization.html"
                )
            )
        ),
        BoardModel(
            title = "Kotlinx Serialization",
            description = "Library for Kotlin data serialization to JSON, XML",
            image = Res.drawable.serialization_prev,
            subcategories = listOf(
                SubcategoryModel(
                    title = "Serialization",
                    link = "https://kotlinlang.org/docs/serialization.html"
                )
            )
        ),
        BoardModel(
            title = "Kotlinx Datetime",
            description = "Multiplatform library for working with date and time",
            image = Res.drawable.datetime_prev,
            subcategories = listOf(
                SubcategoryModel(
                    title = "kotlinx-datetime",
                    description = "A multiplatform Kotlin library for working with date and time",
                    link = "https://github.com/Kotlin/kotlinx-datetime?tab=readme-ov-file#using-in-your-projects"
                )
            )
        ),
        BoardModel(
            title = "Navigation Voyager",
            description = "Multiplatform navigation library",
            image = Res.drawable.voyager_prev,
            subcategories = listOf(
                SubcategoryModel(
                    title = "Setup",
                    link = "https://voyager.adriel.cafe/setup/"
                ),
                SubcategoryModel(
                    title = "Navigation",
                    link = "https://voyager.adriel.cafe/navigation/"
                ),
                SubcategoryModel(
                    title = "Nested navigation",
                    link = "https://voyager.adriel.cafe/nested-navigation/"
                ),
                SubcategoryModel(
                    title = "Multi-module navigation",
                    link = "https://voyager.adriel.cafe/multi-module-navigation/"
                ),
                SubcategoryModel(
                    title = "BottomSheet navigation",
                    link = "https://voyager.adriel.cafe/bottom-sheet-navigation/"
                ),
                SubcategoryModel(
                    title = "Tab navigation",
                    link = "https://voyager.adriel.cafe/tab-navigation/"
                ),
                SubcategoryModel(
                    title = "Screen model",
                    link = "https://voyager.adriel.cafe/screenmodel/"
                ),
            )
        ),
        BoardModel(
            title = "Image loading Coil",
            description = "Image loading library for Android, iOS, and Web",
            image = Res.drawable.coil_prev,
            subcategories = listOf(
                SubcategoryModel(
                    title = "Overview",
                    link = "https://coil-kt.github.io/coil/"
                ),
                SubcategoryModel(
                    title = "Getting Started",
                    link = "https://coil-kt.github.io/coil/getting_started/"
                ),
                SubcategoryModel(
                    title = "Image Loaders",
                    link = "https://coil-kt.github.io/coil/image_loaders/"
                ),
                SubcategoryModel(
                    title = "Image Requests",
                    link = "https://coil-kt.github.io/coil/image_requests/"
                ),
                SubcategoryModel(
                    title = "Targets",
                    link = "https://coil-kt.github.io/coil/targets/"
                ),
                SubcategoryModel(
                    title = "Jetpack Compose",
                    link = "https://coil-kt.github.io/coil/compose/"
                )
            )
        ),
        BoardModel(
            title = "SQLDelight",
            description = "Kotlin multiplatform SQL library for type-safe database access",
            image = Res.drawable.sqldelight_prev,
            subcategories = listOf(
                SubcategoryModel(
                    title = "Overview",
                    link = "https://cashapp.github.io/sqldelight/"
                ),
                SubcategoryModel(
                    title = "Getting Started with SQLite on Multiplatform",
                    link = "https://cashapp.github.io/sqldelight/2.0.2/multiplatform_sqlite/"
                ),
                SubcategoryModel(
                    title = "Foreign Keys",
                    link = "https://cashapp.github.io/sqldelight/2.0.2/multiplatform_sqlite/foreign_keys/"
                ),
                SubcategoryModel(
                    title = "Type Projections",
                    link = "https://cashapp.github.io/sqldelight/2.0.2/multiplatform_sqlite/custom_projections/"
                )
            )
        ),
    )
}