package com.codenvy.example.xstream.core;

import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;

import java.io.Writer;

public class CustomXppDriver extends Xpp3Driver {
    @Override
    public HierarchicalStreamWriter createWriter(Writer out) {
        return new CustomWriter(out, getNameCoder());
    }
}
