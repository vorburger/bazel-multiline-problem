java_binary(
  name = "test",
  javacopts = ["--enable-preview"],
  srcs = ["Hello.java"],
    deps = [
        ":with-multiline",
    ],
    main_class = "Hello",
)

java_library(
    name = "with-multiline",
    srcs = ["Multiline.java"],
    javacopts = ["--enable-preview"],
    visibility = ["//visibility:public"],
)
