**Original repo here**

https://github.com/prscX/react-native-toasty

**Note:**

- This fork uses only the default Toast with props, it doesn't have icons support (reduced bundle size caused by react-native-vector-icons fonts)
- Supports RN 0.60+

**Getting Started**

`$npm install rn-toasty`

`$react-native link rn-toasty` and remove Android linking

**Usage**

```javascript
import { RNToasty } from "rn-toasty";
```

```javascript
// simple
RNToasty.Show({
  title: "This is a toast"
});

// with props
RNToasty.Show({
  title: "Hello toast",
  tintColor: "#657786",
  titleColor: "#f1f1f1",
  titleSize: 18,
  duration: 1
});
```

**Updated Props**

| Prop         | Type                 | Default   | Note                                               |
| ------------ | -------------------- | --------- | -------------------------------------------------- |
| `title`      | `string`             |           | Specify the title of toast                         |
| `titleSize`  | `number`             | 16        | Specify the title size                             |  |
| `titleColor` | `string: HEX-COLOR`  | `#FFFFFF` | Specify the title color                            |  |
| `duration`   | `number`             | 0         | Specify the duration of toast: `0: SHORT; 1: LONG` |
| `tintColor`  | `string: HEX-NUMBER` | `#000000` | Specify the tint color of toast                    |

**Thank to**
https://github.com/prscX
