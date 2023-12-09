package com.example.demo.crawler

import com.example.demo.domain.model.SkiResort

interface Crawler {
    fun crawl(url: String): SkiResort
    fun isCrawlable(url: String): Boolean
}