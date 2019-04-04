package com.fediroryshchuk.hw5;

import java.util.*;

public class MyHashMap<K, V> implements MyMap<K, V> {

    private static final int INITIAL_CAPACITY = 16;
    private Node<K, V>[] hashtable;
    private int size = 0;


    public MyHashMap() {
        hashtable = new Node[INITIAL_CAPACITY];
    }

    private class Node<K, V> {
        private Node<K, V> next;
        private int hash;
        private K key;
        private V value;

        private Node(K key, V value, int hash, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.hash = hash;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node {hashCode=" + hash +
                    ", key=" + key +
                    ", value=" + value +
                    ", next=" + next + '}';
        }
    }


    private int getIndex(K key) {
        if (key == null) {
            return 0;
        }
        return key.hashCode() % hashtable.length;
    }

    private Node<K, V> getNode(K key) {
        int index = getIndex(key);
        if (hashtable[index] != null && (hashtable[index].hash == key.hashCode())) {
            return hashtable[index];
        } else throw new NoSuchElementException("key " + key + "don't exist.");
    }


    public void put(K key, V value) {
        int hash = key.hashCode();
        int index = getIndex(key);
        Node newNode = new Node(key, value, hash, null);
        if (hashtable[index] == null) {
            hashtable[index] = newNode;
            size++;
        } else if (hashtable[index] != null && hashtable[index].key.equals(key)) {
            getNode(key).setValue(value);
        } else {
            size++;
            getNode(key).next = new Node(key, value, hash, null);
        }
    }

    public V remove(K key) {
        V remuvedValue = getNode(key).value;
        hashtable[getIndex(key)] = null;
        size--;
        return remuvedValue;
    }

    public void clear() {
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        return getNode(key).value;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] != null) {
                result.append(hashtable[i])
                        .append(" ");
            }
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
        }
        return false;
    }

    public int hashCode(K key) {
        return Objects.hashCode(key);
    }
}
