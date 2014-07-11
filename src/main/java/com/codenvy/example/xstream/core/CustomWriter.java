package com.codenvy.example.xstream.core;

import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.naming.NameCoder;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;

import java.io.Writer;

public class CustomWriter extends PrettyPrintWriter {

    private boolean outCDATA;

    public CustomWriter(Writer writer, NameCoder nameCoder) {
        super(writer, nameCoder);
    }

    @Override
    public void startNode(String name, Class clazz) {
        super.startNode(name, clazz);
        outCDATA = clazz.equals(String.class);
    }

    @Override
    protected void writeText(QuickWriter writer, String text) {
        if (outCDATA) {
            writer.write("<![CDATA[");
            writer.write(text);
            writer.write("]]>");
        } else {
            writer.write(text);
        }
    }
}
