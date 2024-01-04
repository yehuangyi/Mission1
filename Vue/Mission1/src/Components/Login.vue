<template>
    <div>
      <h2>登录</h2>
      <form @submit.prevent="login">
        <div>
          <label for="username">用户名:</label>
          <input type="text" id="username" v-model="username" required />
        </div>
        <div>
          <label for="password">密码:</label>
          <input type="password" id="password" v-model="password" required />
        </div>
        <div>
          <button type="submit">登录</button>
        </div>
        <div>
          <button @click="goToRegister">注册</button>
        </div>
      </form>
    </div>
  </template>
  
  <script lang="ts">
  export default {
    data() {
      return {
        username: '',
        password: '',
      };
    },
    methods: {
      login() {
        // 在这里编写登录逻辑，可以通过发送请求到后端验证用户名和密码
        // 如果登录成功，可以进行页面跳转或其他操作
        console.log('用户名:', this.username);
        console.log('密码:', this.password);
      },
      goToRegister() {
      // 在这里进行页面跳转到注册页面的操作
      this.$router.push('/register');
    }
    },
  };
  </script>
  
  <style scoped>
  h2 {
    text-align: center;
  }
  form {
    max-width: 300px;
    margin: 0 auto;
  }
  label {
    display: block;
    margin-bottom: 5px;
  }
  input[type='text'],
  input[type='password'] {
    width: 100%;
    padding: 5px;
    margin-bottom: 10px;
  }
  button {
    padding: 10px 20px;
  }
  </style>