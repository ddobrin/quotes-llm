/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.quotes;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application to manage book quotes
 */
@SpringBootApplication
@Theme("quotes")
public class QuotesApplication implements AppShellConfigurator {

  public static void main(String[] args) {
    Runtime r = Runtime.getRuntime();

    System.out.println("Runtime Data:");
    System.out.println("QuotesApplication: Active processors: " + r.availableProcessors());
		System.out.println("QuotesApplication: Total memory: " + r.totalMemory());
		System.out.println("QuotesApplication: Free memory: " + r.freeMemory());
		System.out.println("QuotesApplication: Max memory: " + r.maxMemory());

    SpringApplication.run(QuotesApplication.class, args);
  }
}
#Generate new error codes  public enum ErrorCode {
    QUOTE_NOT_FOUND(1001, "Quote not found"),
    BOOK_NOT_FOUND(1002, "Book not found"),
    AUTHOR_NOT_FOUND(1003, "Author not found"),
    INVALID_INPUT(1004, "Invalid input provided"),
    DATABASE_ERROR(1005, "Database operation failed"),
    UNEXPECTED_ERROR(1006, "An unexpected error occurred"),
    DUPLICATE_QUOTE(1007, "Duplicate quote found"),
    DUPLICATE_BOOK(1008, "Duplicate book found"),
    DUPLICATE_AUTHOR(1009, "Duplicate author found");

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
      this.code = code;
      this.message = message;
    }

    public int getCode() {
      return code;
    }

    public String getMessage() {
      return message;
    }
  }
  