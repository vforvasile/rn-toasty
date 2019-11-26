**Original repo here**

https://github.com/prscX/react-native-toasty

**Note:**

- This fork uses only the default Toast with props, it doesn't have icons support (reduced bundle size caused by react-native-svg fonts)
- Supports RN 0.60+

**Getting Started**

`$npm install rn-toasty`

`$react-native link rn-toasty` and remove Android linking

**Usage**

```javascript
import { RNToasty } from "rn-toasty";
```

```javascript
RNToasty.Show({
  title: "This is a toast"
});
```

**Thank to**
https://github.com/prscX
