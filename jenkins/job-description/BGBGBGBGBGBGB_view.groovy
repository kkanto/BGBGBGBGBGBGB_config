 
listView('BGBGBGBGBGBGB Jobs') {
    description('BGBGBGBGBGBGB Jobs')
    jobs {
        regex('BGBGBGBGBGBGB_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
