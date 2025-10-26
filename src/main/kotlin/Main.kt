package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements


fun main() {
    val doc: Document =
        Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")
            .get()
    val quotes: Elements = doc.select("#sc-14uz67c-0")
    println(quotes)
    for (quote in quotes) {
        println(quote.text())
    }
}