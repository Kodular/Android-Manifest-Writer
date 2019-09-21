package io.kodular.android.manifest.utils;

public final class Util {
    private Util() {
    }

    public static String join(String sep, String... arr) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (i != 0)
                sb.append(sep);
            sb.append(arr[i]);
        }

        return sb.toString();
    }

    @SafeVarargs
    public static <T extends Enum<T>> String join(String sep, Enum<T>... enums) {
        String[] arr = new String[enums.length];

        for (int i = 0; i < enums.length; i++) {
            arr[i] = enums[i].name();
        }

        return join(sep, arr);
    }
}
