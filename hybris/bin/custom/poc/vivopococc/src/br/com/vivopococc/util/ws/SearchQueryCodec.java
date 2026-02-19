package br.com.vivopococc.util.ws;

public interface SearchQueryCodec<QUERY>
{
    QUERY decodeQuery(String query);

    String encodeQuery(QUERY query);
}
