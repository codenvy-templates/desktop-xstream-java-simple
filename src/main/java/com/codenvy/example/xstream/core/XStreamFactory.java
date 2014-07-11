package com.codenvy.example.xstream.core;

import com.thoughtworks.xstream.XStream;

public abstract class XStreamFactory {

    public static XStream buildXStream() {
        return new XStream();
    }

    public static XStream buildXStreamCDATA() {
        return new XStream(new CustomXppDriver());
    }
}
