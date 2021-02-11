fun main() {
    val query = url.parse("https://example.com/foo?bar=baz").query ?: ""
    val parsedQuery = querystring.parse(query)
    println(JSON.stringify(parsedQuery))
}
