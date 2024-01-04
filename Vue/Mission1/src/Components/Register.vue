<template>
    <div>
      <h2>注册</h2>
      <form @submit.prevent="register">
        <div>
          <label for="username">用户名:</label>
          <input type="text" id="username" v-model="username" required />
        </div>
        <div>
          <label for="password">密码:</label>
          <input type="password" id="password" v-model="password" required />
        </div>
        <div>
          <label for="confirmPassword">确认密码:</label>
          <input type="password" id="confirmPassword" v-model="confirmPassword" required />
        </div>
        <div>
          <label for="gender">性别:</label>
          <select id="gender" v-model="gender" required>
            <option value="">请选择</option>
            <option value="male">男性</option>
            <option value="female">女性</option>
          </select>
        </div>
        <div>
          <label for="phone">电话:</label>
          <input type="tel" id="phone" v-model="phone" required />
        </div>
        <div>
          <label for="email">邮箱:</label>
          <input type="email" id="email" v-model="email" required />
        </div>
        <div>
          <button type="submit">注册</button>
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
        confirmPassword: '',
        gender: '',
        phone: '',
        email: '',
      };
    },
    methods: {
      register() {
        // 在这里编写注册逻辑，可以进行表单验证和发送请求到后端保存用户信息
        // 如果注册成功，可以进行页面跳转或其他操作
        console.log('用户名:', this.username);
        console.log('密码:', this.password);
        console.log('确认密码:', this.confirmPassword);
        console.log('性别:', this.gender);
        console.log('电话:', this.phone);
        console.log('邮箱:', this.email);
      },
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
  input[type='password'],
  input[type='tel'],
  input[type='email'] {
    width: 100%;
    padding: 5px;
    margin-bottom: 10px;
  }
  select {
    width: 100%;
    padding: 5px;
    margin-bottom: 10px;
  }
  button {
    padding: 10px 20px;
  }
  </style>