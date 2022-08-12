
@file:JvmName("Constants")

package com.example.background

// Notification Channel constants

// Name of Notification Channel for verbose notifications of background work
@JvmField val VERBOSE_NOTIFICATION_CHANNEL_NAME: CharSequence =
        "Notificaciones detalladas de WorkManager"
const val VERBOSE_NOTIFICATION_CHANNEL_DESCRIPTION =
        "Muestra notificaciones cada vez que comienza el trabajo"
@JvmField val NOTIFICATION_TITLE: CharSequence = "Inicio de solicitud de trabajo"
const val CHANNEL_ID = "VERBOSE_NOTIFICATION"
const val NOTIFICATION_ID = 1

// The name of the image manipulation work
const val IMAGE_MANIPULATION_WORK_NAME = "image_manipulation_work"

// Other keys
const val OUTPUT_PATH = "blur_filter_outputs"
const val KEY_IMAGE_URI = "KEY_IMAGE_URI"
const val TAG_OUTPUT = "OUTPUT"

const val DELAY_TIME_MILLIS: Long = 3000
