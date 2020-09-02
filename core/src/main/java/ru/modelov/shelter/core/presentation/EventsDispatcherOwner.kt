package ru.modelov.shelter.core.presentation

interface EventsDispatcherOwner<T> {
    val eventsDispatcher: EventsDispatcher<T>
}