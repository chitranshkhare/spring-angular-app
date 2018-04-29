package com.ck.demo.webapp.common.utils;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonUtils {

	private static Gson gson = new GsonBuilder().serializeNulls().create();

	private GsonUtils() {
	}

	public static <T> String toJsonObj(T obj) {
		return gson.toJson(obj);
	}

	public static <T> String toJsonList(List<T> objCol) {
		return gson.toJson(objCol);
	}

	public static <T> T fromJsonToObj(String jsonString, Class<T> obj) {
		return gson.fromJson(jsonString, obj);
	}

	public static <T> List<T> fromJsonToList(String jsonString, Type t) {
		return gson.fromJson(jsonString, t);
	}
}